package org.earlorithm;
import com.orm.annotation.*;
@Table(name="employee_project_mapping")
@CompositeKey(columns={"emp_id","project_code","technology_code"})
public class EmployeeProjectMapping implements java.io.Serializable,Comparable<EmployeeProjectMapping>
{
@NotNull
@MaxLength(50)
@PrimaryKey
@Column(name="emp_id")
private String empId;

@NotNull
@MaxLength(10)
@PrimaryKey
@Column(name="project_code")
private int projectCode;

@NotNull
@MaxLength(10)
@PrimaryKey
@Column(name="technology_code")
private int technologyCode;

@NotNull
@MaxLength(10)
@Column(name="start_date")
private java.sql.Date startDate;

@MaxLength(10)
@Column(name="end_date")
private java.sql.Date endDate;

public EmployeeProjectMapping()
{
this.empId="";
this.projectCode=0;
this.technologyCode=0;
this.startDate=null;
this.endDate=null;
}
public EmployeeProjectMapping(String empId,int projectCode,int technologyCode,java.sql.Date startDate,java.sql.Date endDate)
{
this.empId=empId;
this.projectCode=projectCode;
this.technologyCode=technologyCode;
this.startDate=startDate;
this.endDate=endDate;
}
public void setEmpId(String empId)
{
this.empId=empId;
}
public void setProjectCode(int projectCode)
{
this.projectCode=projectCode;
}
public void setTechnologyCode(int technologyCode)
{
this.technologyCode=technologyCode;
}
public void setStartDate(java.sql.Date startDate)
{
this.startDate=startDate;
}
public void setEndDate(java.sql.Date endDate)
{
this.endDate=endDate;
}
public String getEmpId()
{
return this.empId;
}
public int getProjectCode()
{
return this.projectCode;
}
public int getTechnologyCode()
{
return this.technologyCode;
}
public java.sql.Date getStartDate()
{
return this.startDate;
}
public java.sql.Date getEndDate()
{
return this.endDate;
}
public boolean equals(EmployeeProjectMapping employeeProjectMapping)
{
return this.empId.equals(employeeProjectMapping.empId) && this.projectCode==employeeProjectMapping.projectCode && this.technologyCode==employeeProjectMapping.technologyCode;
}
public int compareTo(EmployeeProjectMapping employeeProjectMapping)
{
int ret;
ret=this.empId.compareTo(employeeProjectMapping.empId);
if(ret!=0) return ret;
ret=this.projectCode-employeeProjectMapping.projectCode;
if(ret!=0) return ret;
ret=this.technologyCode-employeeProjectMapping.technologyCode;
return ret;
}
public int hashCode()
{
return java.util.Objects.hash(this.empId,this.projectCode,this.technologyCode);
}
}
