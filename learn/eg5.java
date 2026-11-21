import java.io.*;
class eg5psp
{
public static void main(String gg[])
{
String packageName=gg[0];
String packageDirectoryPath=packageName.replace(".",File.separator);
System.out.println(packageDirectoryPath);
}
}