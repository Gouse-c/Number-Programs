import java.util.Scanner;
class SwappingOfTwoNumbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b : ");
		int b=sc.nextInt();
		System.out.println("Before Swapping : ");
		System.out.println(a);
		System.out.println(b);
		int c=a;
		a=b;
		b=c;
		System.out.println("After Swapping : ");
		System.out.println(a);
		System.out.println(b);
	}
}