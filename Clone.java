import java.util.*;
public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException 
    {
     A a1=new A();
     a1.name="Lalit";
     a1.roll=101;

     A a2=(A)a1.clone();
     a2.name="Gurjar";
     a2.roll=102;

     System.out.println(a1);
     System.out.println(a2);
   }
}
 class A implements Cloneable
{
  String name;
  int roll;

public String toString()
{
 return "{name="+name+" and roll ="+roll+"}" ;
}
public Object clone() throws CloneNotSupportedException 
{
  return super.clone();
}
}