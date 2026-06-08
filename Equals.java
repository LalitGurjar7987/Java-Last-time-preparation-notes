import java.util.*;
public class Equals {
    public static void main(String[] args)
     {
      student s1=new student("Lalit",101);
      student s2=new student("Gurjar",102);
      student s3=new student("Lalit",101);
      student s4=new student("Gurjar",101);

      System.out.println(s1.equals(s2));
      System.out.println(s1.equals(s3));
      System.out.println(s2.equals(s4));
    }
}
class student 
{
   String name;
  int roll;
  student(String name,int roll)
  {
    this.name=name;
    this.roll=roll;
  }

  public boolean equals(Object o)
  {
    if(o instanceof student)
    {
      student s=(student)o;
      if(roll==s.roll && name.equals(s.name))
      {
        return true;
      }
      return false;
    }
    return false;
}
}