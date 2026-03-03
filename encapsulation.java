 class Student{
   private String name;
   private  int age;
    public void setName(String n)
    {
        name=n;
    }
     public void setAge(int a)
    {
        if(a>0)
        {
        age=a;
        }
    }
    public String getName()
    {
       return name;
    }
    public int getAge()
    {
        return age;
    }
}
public class Main{
    public static void main(String[]args)
    {
        Student s=new Student();
        s.setName("anu");
        s.setAge(21);
        System.out.println("name:"+s.getName());
        System.out.println("age:"+s.getAge());
    }
}

