// Test for designed annotation
import com.orm.annotation.*;
@Table(name="employee")
public class Employee
{
@PrimaryKey
@Column(name="emp_id")
private String employeeId;
@Column(name="first_name")
private String firstName;
@Column(name="last_name")
private  String  lastName;
//Option 1
@NotNull
@ForeignKey(table="department",column="code")
@Column(name="department_code")
private int department;
//Option 2
@NotNull
@ForeignKey(entity="department",property="code")
@Column(name="department_code")
private int departmentCode;
//Option 3
@NotNull
@ForeignKey
@Column(name="department_code")
private Department department;

@CheckValueIn(values=["M","m","F","f"])
private String gender;
@CheckValueIn(values=[27,28,29])
@NotNull
@Column(name="state_code")
private int stateCode;
@NotNull
@Column
@Precision("10.2")
@CheckValueGreaterThan(0.0)
private java.math.BigDecimal salary;
}