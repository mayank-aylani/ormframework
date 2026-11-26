class eg7psp
{
public static void main(String gg[])
{
String a="kalia.balia.talia"; 
String b=a.replaceAll("\\.",java.io.File.separator+java.io.File.separator);
String c=a.replace(".",java.io.File.separator);
System.out.println(b);
System.out.println(c);
}
}