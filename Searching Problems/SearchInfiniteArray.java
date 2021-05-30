import java.util.Scanner;
class SearchInfiniteArray
{
	public static int binarySearch(int arr[], int low, int high, int x)
	{
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==x)
				return mid;
			else if(arr[mid]>x)
				high=mid-1;
			else
				low=mid+1;
		}
		return -1;
	}
	public static int getElementIndex(int arr[], int x)
	{
		// Naive Approach (Time Complexity - O(position of searching element))
		// int i=0;
		// while(true)
		// {
		// 	if(arr[i]>x)
		// 		return -1;
		// 	if(arr[i]==x)
		// 		return i;
		//	i++;
		// }
		// return index;

		// Better Approach (O(log n))
		int i=1;
		if(arr[0]==x)
			return 0;
		else
		{
			while(true)
			{
				if(arr[i]==x)
					return i;
				else if(arr[i]>x)
					return binarySearch(arr, (i/2)+1, i-1, x);
				else
				{
					i=i*2;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		System.out.println(getElementIndex(arr,x));
	}
}