import com.orm.db.*;
import java.sql.*;
class TestDBConnector
{
public static void main(String gg[])
{
Connection connection=DBConnector.connect();
try
{
connection.close();
}catch(SQLException sqlException)
{
}
System.out.println("Connection test successful");
}
}