import java.util.Scanner;
class Except2And3Multiples
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the size of n : ");
		int n=sc.nextInt();
		System.out.println("The Numbers Are : ");
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0 && i%3!=0)
			{
				System.out.println(i);
			}
		}
	}
}
