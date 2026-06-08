import java.util.*;

public class Singleton {
    public static void main(String[] args) 
    {
       A a1=A.getObject();
      a1.set(101,"Lalit");
      a1.get();
    }
}
class A
{
  static A a;
 private A(){};
 int roll;
 String name;
 public void set(int roll,String name)
 {
  this.roll=roll;
  this.name=name;
 }
 public void get()
 {
  System.out.println(roll);
  System.out.println(name);
 }
 static A getObject()
 {
  if(a==null)
  {
    a=new A();
    return a;
  }
  return a;
 } 
}