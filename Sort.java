//user input sort number
import java.util.Scanner;
class Sort
{
  // Main driver method
Static int i=0;
    public static void main(String[] args)
    {
   
   sort ref =new sort();
   ref.sorting();
   }
   
    public static void sorting()
    {
      Scanner sc=new Scanner(System.in);
    int arr[]= new int[10];
    System.out.println("How many numbers do you want to print ");
    int n=sc.nextInt();

    int d=0;int temp;
     System.out.println("Enter the numbers ");
	for( i=0;i<n;i++)
    
    {
    arr[i]=sc.nextInt();
    }
    System.out.println("Before sorting ");
    for( i=0;i<arr.length;i++)
    {
         for(int j=i+1;j<arr.length;j++)
		{

          if(arr[j]<arr[i])
          {
          //swapping
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          }
    }
     // Printing sorted array elements
	 System.out.println("after swapping in ASC order ");
            System.out.print(arr[i]+" ");
    }
    }
}