/*
create table Booking
(
serial_number int,
booking_date date,
customer_name varchar(50) not null,
primary key(serial_number,booking_date)
);
create table Billing
(
id int primary key,
serial_number int,
bill_date date,
amount decimal(10,2) not null,	
foreign key(serial_number,booking_date) references from Booking(serial_number,booking_date)
);
*/
import com.orm.annotation.*;
@Table(name="billing")
public class Billing
{
@Auto
@PrimaryKey
@Column
private int id;
@Column
private BigDecimal amount;
//are foreign keys
@Column(name="serial_number")
private int serialNumber;
@Column(name="booking_date")
private java.util.Date bookingDate;
}