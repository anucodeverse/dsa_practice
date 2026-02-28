public class Main
{
    static int doubleGame(int a){
        return a*2;
    }
    public static void main(String[] args)
    {
       for(int i=1;i<=5;i++)
       {
           System.out.println("double of "+i+" is "+doubleGame(i));
       }
    }
}
