import java.util.Scanner;
public class PrimesInRange
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num=sc.nextInt();
		for(int i=2;i<num;i++)
		{
			if(PrimeRange.isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
	}
}
class PrimeRange
{
	public static boolean isPrime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}