import java.util.Scanner;
class BouncyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number"); //123562
		int num = sc.nextInt();
		int n1 = 0;   //boolean pos=false;
		int n2 = 0;   //boolean neg=false;
		while (num > 0)
		{
			int rem1 = num%10; 
			num = num / 10;
			int rem2 = num%10;

			if (rem1>rem2)
			{
				n1=1;		//pos=true
			}
			if (rem1<rem2)
			{
				n2=1;		//neg=true
			}

			/* if (pos && neg)		
		{
			System.out.println("Bouncy number");
			System.exit(0);
		}
		else 
		{
			System.out.println("not bouncy number");	
		} */
		}
		if (n1==1 && n2 ==1)		
		{
			System.out.println("Bouncy number");
			System.exit(0);
		}
		else 
		{
			System.out.println("not bouncy number");	
		}
	}
}
