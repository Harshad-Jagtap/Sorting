// Java Program to sort an elements using bubble sort
// by bringing Arrays into play
import java.util.Arrays;
public class BubbleSort
{
	public static void main(String[] args) 
	{
		int a[]={10,2,30,22,111,45,56,1};
        int n=a.length;
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