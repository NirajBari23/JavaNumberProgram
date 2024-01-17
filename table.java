import java.util.Scanner;
class table
{
	public static void main(String[] args) 
	{
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int start=0;
		while(start<=10)
		{
			System.out.println(num+"*"+start+"="+(num*start));
			start++;
		}
	}
}
