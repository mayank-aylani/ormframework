class eg6psp
{
public static void main(String gg[])
{
String tableName=gg[0];
String className="";
String splits[]=tableName.split("_");
for(String split:splits)
{
if(split.trim().length()==0) continue;   //student_details 
className+=split.substring(0,1).toUpperCase();
System.out.println("In loop : "+className);
System.out.println("---------------------");
System.out.println("Before if(tableName.length()>0) : "+tableName.length());
if(tableName.length()>0) className+=split.substring(1).toLowerCase();
System.out.println("After if(tableName.length()>0) : "+className);
}
}
}