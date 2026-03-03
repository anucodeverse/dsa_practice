public class Main
{
    String name;
    int age;
    public Main(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void display()
    {
         System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
	public static void main(String[] args) {
        Main m=new Main("anu",21);
        m.display();
       
	}
