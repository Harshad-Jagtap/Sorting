class InsertionSort 
{
	public static void main(String[] args) 
	{
		System.out.println("Insertion sort");
		int a[]={5,1,6,10,20,2,4,3};
		int temp,j;
		for(int i=1;i<a.length;i++)
		{
			temp=a[i];
				j=i;
			while(j>0 && a[j-1]>temp)
			{
				
				a[j]=a[j-1];
				j=j-1;
            }
			a[j]=temp;
	    }
		for(int i=1;i<a.length;i++)
		{
	    System.out.println(a[i]+" ");
		}
	}	
}