package org.earlorithm;
import com.orm.annotation.*;
@Table(name="department")
public class Department implements java.io.Serializable,Comparable<Department>
{
@NotNull
@MaxLength(10)
@Auto
@PrimaryKey
@Column(name="code")
private int code;

@NotNull
@MaxLength(50)
@Unique
@Column(name="name")
private String name;

public Department()
{
this.code=0;
this.name="";
}
public Department(int code,String name)
{
this.code=code;
this.name=name;
}
public Department(String name)
{
this.code=0;
this.name=name;
}
public void setCode(int code)
{
this.code=code;
}
public void setName(String name)
{
this.name=name;
}
public int getCode()
{
return this.code;
}
public String getName()
{
return this.name;
}
public boolean equals(Department department)
{
return this.code==department.code;
}
public int compareTo(Department department)
{
int ret;
ret=this.code-department.code;
return ret;
}
public int hashCode()
{
return java.util.Objects.hash(this.code);
}
}
