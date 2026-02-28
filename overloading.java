public class Main
{
    static int doubleGame(int a){
        return a;
    }
    static double doubleGame(double b)
    {
        return b;
    }
    public static void main(String[] args)
    {
       int n1=doubleGame(2);
       double n2=doubleGame(4.5);
       System.out.println("int:"+n1);
       System.out.println("double"+n2);
    }
}
