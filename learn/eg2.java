class aaa
{
public void doSomething(Object obj)
{
System.out.println(obj.getClass().getName());
System.out.println(obj instanceof int[]);
}
}
class eg254psp
{
public static void main(String gg[])
{
aaa a=new aaa();
int []x={10,20,30};
a.doSomething(x);
}
}