import java.util.Scanner;
class factors 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
			int sum=0;
		int start=1;
		while(start<=num)
		{
			if (num%start==0)
			{
				System.out.println(start);
				sum=sum+start;
			}
			start++;
		}
		System.out.println("the sum of the factors is "+(sum));
	}
}
