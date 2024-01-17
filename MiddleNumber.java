import java.util.Scanner;
class MiddleNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int small = a<b&&a<c?a:b<c?b:c;
		int big = a>b&&a>c?a:b>c?b:c;
		int middle = a*b*c/3;
	}
}
