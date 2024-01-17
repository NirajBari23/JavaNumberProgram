//A palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
//It can also be a string like LOL, MADAM etc.

import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int reverse=0;

		while(num>0)
		{
			int lastdigit=num%10;
			reverse = reverse*10 + lastdigit;
			num = num/10;
		}
		if (temp==reverse	)
		{
			System.out.println("it is palindrome");
		}
		else 
		{
			System.out.println("it is not palindrome");
		}
	}
}
