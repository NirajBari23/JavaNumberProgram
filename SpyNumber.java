import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp=1;
		int sum=0;

			
			for (int i=num;i>0 ;i/=10 )
			{
				int rem = i % 10;
				temp = temp * rem;
				sum = sum + rem;
			}
			if (sum == temp)
			{
				System.out.println("it is spy number");
			}
			else
			{
				System.out.println("it is not spy number");
			}

	}
}
