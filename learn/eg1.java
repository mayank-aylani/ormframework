class aaa
{
public void doSomething(Object a)
{
Integer u[];
u=(Integer [])a;
for(int e=0;e<u.length;e++)
{
System.out.println(u[e].intValue());
}
}
}
class eg253psp
{
public static void main(String gg[])
{
Integer i[]={10,20,30};
int k[]={10,20,30};
aaa a=new aaa();
a.doSomething(i);
a.doSomething(k);
}
}