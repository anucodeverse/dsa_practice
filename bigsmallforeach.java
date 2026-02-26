public class Main
{
	public static void main(String[] args) {
        int numbers[]={12,1,4,56,3};
        int max=numbers[0];
        int min=numbers[0];
        for(int n:numbers)
        {
            if(n>max)
            max=n;
            if(n<min)
            min=n;
        }
        System.out.println(max);
        System.out.println(min);
	}
}
