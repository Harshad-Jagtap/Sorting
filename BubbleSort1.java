// Java Program to sort an elements using bubble sort
// by bringing Arrays into play user input
import java.util.Scanner;
public class BubbleSort1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        int a[]={110,2,89,23};
 	 int n=a.length;
	    
        
		//bubble sort
		for(int i=n-1;i>=0;i--)
		{
			int max=i;
			for(int j=0;j<i-1;j++)
			{
				if(a[j]<a[i])
				{
					max=j;
					int temp=a[max];
					a[max]=a[i];
					a[i]=temp;
	            }
	        }
			System.out.println(a[i]);
	   }
     }
}