import java.util.Scanner;
class PalindromeString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter the String : ");
		String str=sc.nextLine();
		String rev=new StringBuilder(str).reverse().toString();
		if(str.equals(rev))
		{
			System.out.println("The given string is a palindrome..");
		}
		else
		{
			System.out.println("The given string is not a palindrome..");
		}
	}
}