import java.util.Scanner;
class Fibonaaci 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int a=0;
		int b=1;
		int c = 0;
		if (num==1)
		{
			System.out.print(a);
		}
		else if (num==2)
		{
			System.out.print(a+" "+b+" ");
		}
		else
		{
			//System.out.print(a+" "+b+" ");
			for (int i=3;i<=num ;i++ )
			{
				 c = a+b;
				//System.out.print(c+" ");
				a=b;
				b=c;
			}
			System.out.print(c+"");
		}
	}
}
