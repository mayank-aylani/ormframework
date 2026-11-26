package org.earlorithm;
import com.orm.annotation.*;
@Table(name="project")
public class Project implements java.io.Serializable,Comparable<Project>
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
@Column(name="title")
private String title;

public Project()
{
this.code=0;
this.title="";
}
public Project(int code,String title)
{
this.code=code;
this.title=title;
}
public Project(String title)
{
this.code=0;
this.title=title;
}
public void setCode(int code)
{
this.code=code;
}
public void setTitle(String title)
{
this.title=title;
}
public int getCode()
{
return this.code;
}
public String getTitle()
{
return this.title;
}
public boolean equals(Project project)
{
return this.code==project.code;
}
public int compareTo(Project project)
{
int ret;
ret=this.code-project.code;
return ret;
}
public int hashCode()
{
return java.util.Objects.hash(this.code);
}
}
