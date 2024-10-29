import java.util.Scanner;
import java.util.Arrays;
class ArraySorting
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the number of names : ");
		int n=sc.nextInt();
		sc.nextLine();
		String names[]=new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter name #" +(i+1) + ":");
			names[i]=sc.nextLine();
		}
		Arrays.sort(names);
		System.out.println("\nSorted Array :");
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
	}
}