import java.util.Scanner;
class game 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.paper 2.scissors 3.rock");
		int user1=sc.nextInt();
		System.out.println("1.paper 2.scissors 3.rock");
		int user2=sc.nextInt();

		if (user1==1)
		{
			if (user2==1)
			{
				System.out.println("MATCH DRAW");
			}
			else if (user2==2)
			{
				System.out.println("USER 2 WON");
			}
			else if (user2==3)
			{
				System.out.println("USER 1 WON");
			}
		}
		else if (user1==2)
		{
			if (user2==1)
			{
				System.out.println("USER 1 WON");
			}
			else if (user2==2)
			{
				System.out.println("MATCH DRAW");
			}
			else if (user2==3)
			{
				System.out.println("USER 2 WON");
			}
		}
		else if (user1==3)
		{
			if (user2==1)
			{
				System.out.println("USER 2 WON");
			}
			else if (user2==2)
			{
				System.out.println("USER 1 WON");
			}
			else if (user2==3)
			{
				System.out.println("MATCH DRAW");
			}
		}

	}
}
