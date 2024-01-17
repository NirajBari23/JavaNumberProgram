import java.util.Scanner;
class  PerfectNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int sum = 0;

		for (int i=1;i<num ;i++ )
		{
			if (num%i==0)
			{
				sum = sum+i;
			}
			
		}
		System.out.println(sum);
		if (sum==num)
		{
			System.out.println("it is perfect number");
		}
		else
			System.out.println("it is not perfect number");
	}
}
