import java.util.Scanner;
class SquareRoot
{
	public static int getSquareRoot(int n)
	{
		int low=1;
		int high=n;
		int answer=0;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(mid*mid==n)
				return mid;
			else if(mid*mid>n)
				high=mid-1;
			else
			{
				answer=mid;
				low=mid+1;
			}
		}
		return answer;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(getSquareRoot(n));
	}
}