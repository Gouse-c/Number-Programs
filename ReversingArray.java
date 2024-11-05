import java.util.Scanner;
class ReversingArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the size of array : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("\nEnter the array Elements : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("\nBefore Revering >> ");
		for(int i=0;i<a.length;++i){
			System.out.print(a[i]+" ");
		}
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=a[n-1-i];
		}
		System.out.print("\nAfter Revering >> ");
		for(int i=0;i<n;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}
		