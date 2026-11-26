package org.earlorithm;
import com.orm.annotation.*;
@Table(name="employee")
public class Employee implements java.io.Serializable,Comparable<Employee>
{
@NotNull
@MaxLength(15)
@PrimaryKey
@Column(name="emp_id")
private String empId;

@NotNull
@MaxLength(50)
@Column(name="name")
private String name;

@NotNull
@MaxLength(10)
@Column(name="department_code")
private int departmentCode;

@NotNull
@MaxLength(10)
@Column(name="date_of_birth")
private java.sql.Date dateOfBirth;

@NotNull
@MaxLength(1)
@Column(name="gender")
private String gender;

@NotNull
@MaxLength(10)
@Precision(2)
@Column(name="gross_salary")
private java.math.BigDecimal grossSalary;

@NotNull
@MaxLength(1)
@Column(name="is_indian")
private boolean isIndian;

public Employee()
{
this.empId="";
this.name="";
this.departmentCode=0;
this.dateOfBirth=null;
this.gender="";
this.grossSalary=new java.math.BigDecimal("0.0");
this.isIndian=false;
}
public Employee(String empId,String name,int departmentCode,java.sql.Date dateOfBirth,String gender,java.math.BigDecimal grossSalary,boolean isIndian)
{
this.empId=empId;
this.name=name;
this.departmentCode=departmentCode;
this.dateOfBirth=dateOfBirth;
this.gender=gender;
this.grossSalary=grossSalary;
this.isIndian=isIndian;
}
public void setEmpId(String empId)
{
this.empId=empId;
}
public void setName(String name)
{
this.name=name;
}
public void setDepartmentCode(int departmentCode)
{
this.departmentCode=departmentCode;
}
public void setDateOfBirth(java.sql.Date dateOfBirth)
{
this.dateOfBirth=dateOfBirth;
}
public void setGender(String gender)
{
this.gender=gender;
}
public void setGrossSalary(java.math.BigDecimal grossSalary)
{
this.grossSalary=grossSalary;
}
public void setIsIndian(boolean isIndian)
{
this.isIndian=isIndian;
}
public String getEmpId()
{
return this.empId;
}
public String getName()
{
return this.name;
}
public int getDepartmentCode()
{
return this.departmentCode;
}
public java.sql.Date getDateOfBirth()
{
return this.dateOfBirth;
}
public String getGender()
{
return this.gender;
}
public java.math.BigDecimal getGrossSalary()
{
return this.grossSalary;
}
public boolean getIsIndian()
{
return this.isIndian;
}
public boolean equals(Employee employee)
{
return this.empId.equals(employee.empId);
}
public int compareTo(Employee employee)
{
int ret;
ret=this.empId.compareTo(employee.empId);
return ret;
}
public int hashCode()
{
return java.util.Objects.hash(this.empId);
}
}
