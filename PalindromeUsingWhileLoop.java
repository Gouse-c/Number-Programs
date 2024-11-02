import java.util.Scanner;
class PalindromeUsingWhileLoop
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the number : ");
		int num=sc.nextInt();
		String s1="";
		int originalValue=num;
		while(num!=0)
		{
			int rem=num%10;
			s1+=rem;
			num=num/10;
		}
		int rev=Integer.parseInt(s1);
		if(originalValue==rev){
			System.out.println(originalValue+" is palindrome");
		}else{
			System.out.println(originalValue+" is not palindrome");
		}
		System.out.println(s1);
	}
}
