import java.util.Scanner;
class IndexOfFirstOccurrence
{
	public static int elementIndex(int arr[], int x)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==x)
			{
				if(mid==0 || (mid!=0 && arr[mid-1]!=x))
					return mid;
				else
				{
					high=mid-1;
				}
			}
			else if(arr[mid]>x)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();

		System.out.println(elementIndex(arr,x));
	}
}