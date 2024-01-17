import java.util.Scanner;
class PracticeArmstrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		int num = sc.nextInt();    //370
		int count=0; 
		int temp=num;
		int sum=0;
		
		/* for (int i=num;i>0 ;i/=10 )
		{
			count++;
		}
		System.out.println(count);    //225
		
		for(int j=num;j>0;j/=10)
		{
			int rem = j%10;
			int p = 1;
		   for (int k=0;k<count ;k++ )
		   {
			   p=p*rem;  //5*1,5*5,25*5,125
		   }
			sum=sum + p;
		}
		if (sum==num)
		{
			System.out.println("it is armstrong");
		}
			else
				System.out.println("it is not"); */
		
		/* while (num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);

		while (temp>0)
		{
			int rem = num%10;
			int p = 1;
			int j = 0;
			if (j<count)
			{
				p = p*rem;
				j++;
			}
			sum = sum+p;
			temp = temp/10;
		}
		if (sum==num)
		{
			System.out.println("it is armstrong");
		}
			else
				System.out.println("it is not"); */


		do
		{
			count++;
			num /= 10;
		}
		while (num>0);
		System.out.println(count);

		do
		{
			int rem = num % 10;
			int p=1;
			int i=0;
			if (i<count)
			{
				p = p*rem;
				i++;
			}
			sum = sum + p;
			temp /=10;
		}
		while (temp>0);
		
		if (sum==num)
		{
			System.out.println("it is armstrong");
		}
			else
				System.out.println("it is not");
	}
}
