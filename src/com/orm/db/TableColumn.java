package com.orm.db;
public class TableColumn
{
private String name;
private int width;
private int precision;
private String type;
private boolean hasPrimaryKeyConstraintApplied;
private boolean isAutoIncrementable;
private boolean hasNotNullConstraintApplied;
private boolean hasUniqueConstraintApplied;
private String defaultValue;
public TableColumn()
{
this.name="";
this.width=0;
this.precision=0;
this.type="";
this.hasPrimaryKeyConstraintApplied=false;
this.isAutoIncrementable=false;
this.hasNotNullConstraintApplied=false;
this.hasUniqueConstraintApplied=false;
this.defaultValue="";
}
public void setName(java.lang.String name)
{
this.name=name;
}
public java.lang.String getName()
{
return this.name;
}
public void setWidth(int width)
{
this.width=width;
}
public int getWidth()
{
return this.width;
}
public void setPrecision(int precision)
{
this.precision=precision;
}
public int getPrecision()
{
return this.precision;
}
public void setType(java.lang.String type)
{
this.type=type;
}
public java.lang.String getType()
{
return this.type;
}
public void setHasPrimaryKeyConstraintApplied(boolean hasPrimaryKeyConstraintApplied)
{
this.hasPrimaryKeyConstraintApplied=hasPrimaryKeyConstraintApplied;
}
public boolean getHasPrimaryKeyConstraintApplied()
{
return this.hasPrimaryKeyConstraintApplied;
}
public void setIsAutoIncrementable(boolean isAutoIncrementable)
{
this.isAutoIncrementable=isAutoIncrementable;
}
public boolean getIsAutoIncrementable()
{
return this.isAutoIncrementable;
}
public void setHasNotNullConstraintApplied(boolean hasNotNullConstraintApplied)
{
this.hasNotNullConstraintApplied=hasNotNullConstraintApplied;
}
public boolean getHasNotNullConstraintApplied()
{
return this.hasNotNullConstraintApplied;
}
public void setHasUniqueConstraintApplied(boolean hasUniqueConstraintApplied)
{
this.hasUniqueConstraintApplied=hasUniqueConstraintApplied;
}
public boolean getHasUniqueConstraintApplied()
{
return this.hasUniqueConstraintApplied;
}
public void setDefaultValue(java.lang.String defaultValue)
{
this.defaultValue=defaultValue;
}
public java.lang.String getDefaultValue()
{
return this.defaultValue;
}
}