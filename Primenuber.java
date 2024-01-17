import java.util.Scanner;
class Primenuber 
{
	public static boolean isSolution (int a)
	{
		for (int i =2;i < a/2 ;i++ )
		{
			if (a%i==0)
			{
				return false;
			}
			
		}return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter start number");
		int start = sc.nextInt();
		System.out.println("enter end number");
		int end = sc.nextInt();
		
		for (;start<=end ;start++ )
		{
			if (isSolution(start))
			{
			System.out.println(start+" = "+"is prime number");
			break;
			}
			
		}
		for (;end>=start ;end-- )
		{
			if (isSolution(end))
			{
			System.out.println(end+" = "+"is prime number");
			break;

			}
		}
	}
}
