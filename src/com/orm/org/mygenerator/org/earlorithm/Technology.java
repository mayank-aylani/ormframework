package org.earlorithm;
import com.orm.annotation.*;
@Table(name="technology")
public class Technology implements java.io.Serializable,Comparable<Technology>
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

public Technology()
{
this.code=0;
this.name="";
}
public Technology(int code,String name)
{
this.code=code;
this.name=name;
}
public Technology(String name)
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
public boolean equals(Technology technology)
{
return this.code==technology.code;
}
public int compareTo(Technology technology)
{
int ret;
ret=this.code-technology.code;
return ret;
}
public int hashCode()
{
return java.util.Objects.hash(this.code);
}
}
