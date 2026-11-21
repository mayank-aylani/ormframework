package com.orm.db;
import java.sql.*;
import java.util.*;
import com.orm.exceptions.*;
public class DatabaseUtil
{
private DatabaseUtil(){} 
public static Database getDatabase(Connection connection) throws DBException
{
Database database=new Database();
try
{
DatabaseMetaData databaseMetaData=connection.getMetaData();
ResultSet tablesResultSet; tablesResultSet=databaseMetaData.getTables(connection.getCatalog(),null,"%",new String[]{"TABLE"});
List<Table> tables=new ArrayList<>();
List<TableColumn> tableColumns;
ResultSet columnsResultSet;
Table table;
TableColumn tableColumn;
String tableName;
String columnName;
String typeName;
int columnSize;
int decimalDigits;
String isNullable;
String defaultValue;
String isAutoIncrement;
boolean isPrimaryKey;
boolean isUnique;
Set<String> primaryKeysSet;
Set<String> uniqueKeysSet;
String primaryKeyColumnName;
String uniqueKeyColumnName;
ResultSet primaryKeysResultSet;
ResultSet uniqueKeysResultSet;
while(tablesResultSet.next())
{
table=new Table();
tableColumns=new ArrayList<TableColumn>(); 
tableName=tablesResultSet.getString("TABLE_NAME").trim();
table.setName(tableName);
primaryKeysSet=new HashSet<>(); 
primaryKeysResultSet=databaseMetaData.getPrimaryKeys(connection.getCatalog(),null,tableName);
while(primaryKeysResultSet.next())
{
primaryKeyColumnName=primaryKeysResultSet.getString("COLUMN_NAME").trim();
primaryKeysSet.add(primaryKeyColumnName);
}
primaryKeysResultSet.close(); uniqueKeysResultSet=databaseMetaData.getIndexInfo(connection.getCatalog(),null,tableName,true,false);
uniqueKeysSet=new HashSet<>();
while(uniqueKeysResultSet.next())
{
uniqueKeyColumnName=uniqueKeysResultSet.getString("COLUMN_NAME");
uniqueKeysSet.add(uniqueKeyColumnName);
}
uniqueKeysResultSet.close(); 
columnsResultSet=databaseMetaData.getColumns(connection.getCatalog(),null,tableName,"%");
while(columnsResultSet.next())
{
columnName=columnsResultSet.getString("COLUMN_NAME").trim(); 
typeName=columnsResultSet.getString("TYPE_NAME").trim(); 
columnSize=columnsResultSet.getInt("COLUMN_SIZE"); 
decimalDigits=columnsResultSet.getInt("DECIMAL_DIGITS"); 
isNullable=columnsResultSet.getString("IS_NULLABLE"); 
defaultValue=columnsResultSet.getString("COLUMN_DEF").trim(); 
isAutoIncrement=columnsResultSet.getString("IS_AUTOINCREMENT"); 
isPrimaryKey=primaryKeysSet.contains(columnName);
isUnique=uniqueKeysSet.contains(columnName);
tableColumn=new TableColumn();
tableColumn.setName(columnName);
tableColumn.setWidth(columnSize);
tableColumn.setPrecision(decimalDigits);
tableColumn.setType(typeName); 
tableColumn.setHasPrimaryKeyConstraintApplied(isPrimaryKey); 
tableColumn.setIsAutoIncrementable(isAutoIncrement.equalsIgnoreCase("YES")); 
tableColumn.setHasNotNullConstraintApplied(isNullable.equalsIgnoreCase("YES")); 
tableColumn.setHasUniqueConstraintApplied(isUnique);
tableColumn.setDefaultValue(defaultValue);
tableColumns.add(tableColumn);
}
columnsResultSet.close();
table.setTableColumns(tableColumns);
tables.add(table);
}
tablesResultSet.close();
database.setTables(tables);
}catch(SQLException sqlException)
{
throw new DBException(sqlException.getMessage());
}
return database;
}
}