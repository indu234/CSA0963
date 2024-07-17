import java.io.*;
class person
{
void getfirstname()
{
System.out.println("sai");
}
void getlastname()
{
System.out.println("krishna");
}
}
class employee extends person
{
void getemployeed()
{
System.out.println("employeed");
}
void getlastname()
{
System.out.println("manager");
}
public static void main(String args[])
{
employee a=new employee();
a.getfirstname();
a.getlastname();
}
}

