import java.util.Scanner;
class CountOfDivisorsForGivenNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		System.out.println("The divisors are : ");
		int divCount=findDivisors(num);
		System.out.println("The count of divisors of given number is : "+divCount);
	}
	public static int findDivisors(int num){
		int divCount=0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				System.out.println(i+" ");
				divCount++;
			}
		}
		return divCount;
	}
}