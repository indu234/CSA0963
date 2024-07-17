import java.io.*;
class person
{
String name1="indu";
String name2="priya";
void firstname()
{
System.out.println("firstname :"+ name1);
}
void lastname()
{
System.out.println("lastname :"+name2);
}
}
class employee extends person
{
void lastname()
{
System.out.println("ENGINEERING");
}
public static void main(String args[])
{
employee e=new employee();
e.firstname();
e.lastname();
}
}