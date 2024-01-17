import java.util.Scanner;
class BuzzNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int num = sc.nextInt();

		int rem=num%10;

			if (rem==7)
			{
				System.out.println("It is Buzz number");
			}
			else if (num%7==0)
			{
				System.out.println("It is Buzz number");
			}
			else 
			{	
				System.out.println("It is not Buzz number");
			}
		
	



//ALSO
 if (num%7==0 || num%10==7)
 {
	System.out.println("It is Buzz number");
	System.exit(0);
 }
 else
 {
	System.out.println("It is not Buzz number");
 }
 }}