import java.util.Scanner;
class  PetersonNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();   //145
		int temp = num;
		 //int fact=1; // Dont take this as global variable it should be inside the loop as a local variable 
		int sum=0;  //0,120

		for (int i=num;i>0 ;i/=10 )   //145,14
		{ 
			int fact=1; 
			int rem = i%10;    //rem=5
			for (int j=1;j<=rem ;j++ ) //1<=5
			{
				fact = fact*j;   //1*1,1*2,2*3,6*4,24*5
			}
			sum = sum + fact;  //0+120
		}
			
		if (temp==sum)
		{
			System.out.println("it is peterson number");
		}
		else
			{
			System.out.println("it is NOT peterson number");
			}

	}
}
