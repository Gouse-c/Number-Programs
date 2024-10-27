import java.util.Scanner;
class NaturalNumbersExceptSomeMultiples
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Start Point : ");
		int a=sc.nextInt();
		System.out.println("\nEnter the End Point : ");
		int n=sc.nextInt();
		System.out.println("\nThe Natural Numbers are : ");
		for(int i=a;i<=n;i++)
		{
			if(i%7!=0 && i%8!=0 && i%9!=0)
			{
				System.out.println(i);
			}
		}
	}
}