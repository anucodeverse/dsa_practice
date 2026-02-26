public class Main
{
	public static void main(String[] args) {
	    int numbers[]={3,1,-1,0,9};
	    for(int n:numbers)
	    {
	        if(n<0)
	        continue;
	        if(n==9)
	        break;
	         System.out.println(n);
	    }
	   
	}
}
