import java.util.Scanner;
class CountOneBinaryArray
{
	public static int getCount(int arr[])
	{
		int index1=firstOccuren(arr);
		if(index1==-1)
		{
			return 0;
		}
		//return lastOccuren(arr)-index1+1;
		return arr.length-index1;
	}
	public static int firstOccuren(int arr[])
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==1)
			{
				if(mid==0 || (mid!=0 && arr[mid-1]!=1))
					return mid;
				else
					high=mid-1;
			}
			else
				low=mid+1;
		}
		return -1;
	}
	// public static int lastOccuren(int arr[])
	// {
	// 	int low=0;
	// 	int high=arr.length-1;
	// 	while(low<=high)
	// 	{
	// 		int mid=(low+high)/2;
	// 		if(arr[mid]==1)
	// 		{
	// 			if(mid==arr.length-1 || (mid!=arr.length-1 && arr[mid+1]!=1))
	// 				return mid;
	// 			else
	// 				low=mid+1;
	// 		}
	// 		else
	// 			low=mid+1;
	// 	}
	// 	return -1;
	// }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(getCount(arr));
	}
}