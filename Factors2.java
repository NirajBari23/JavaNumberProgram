import java.util.Scanner;
class factors2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter a number");
		int num=sc.nextInt();
		System.out.println("1.factors 2.count 3.sum");
		System.out.println("enter your choice");
		int choice=sc.nextInt();
        int count=0;
		int sum=0;
		switch(choice)
		{
			case 1:
			{
				for (int i=1;i<=num ;i++ )
				{
					if(num%i==0)
					{
						System.out.println(i);
					}
				}

				break;
			}
			case 2:
			{
				for (int i=1;i<=num ;i++ )
				{
					if(num%i==0)
					{
						count++;
					}
				}
				System.out.println(count);
				break;
			}
			case 3:
				{
				for (int i=1;i<=num ;i++ )
				{
					if(num%i==0)
					{
						sum=sum+i;
					}
				}
				System.out.println(sum);
				break;
			}
		}
			
	}
}
