import java.util.Scanner;
class PalindromeNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the number :");
		int num=sc.nextInt();
		String temp=Integer.toString(num);
		temp=new StringBuffer(temp).reverse().toString();
		int rev=Integer.parseInt(temp);
		if(num==rev)
		{
			System.out.println("The number is a palindrome Number..");
		}
		else
		{
			System.out.println("The number is not a palindrome number..");
		}
	}
}
/*origin=value;
while(num!=0){
	int rem=num%10;
	temp+=rem;
	num/=10;
}
int rev=Integr.parseint(remo
if(oring=rev({
	else{
		*/