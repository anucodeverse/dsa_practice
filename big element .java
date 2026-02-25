
public class Main
{
	public static void main(String[] args) {
		int arr[]={5,1,42,3,0};
		int big=arr[0];
		for(int i=0;i<arr.length;i++)
		{
		    
		    if(arr[i]>big)
		    {
		        big=arr[i];
		    }
		}
		System.out.println("large number"+big);
	}
}
