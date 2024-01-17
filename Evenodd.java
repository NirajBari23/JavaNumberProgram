class Evenodd
{
	public static void main(String[] args) 
	{
		int num = 69;
		boolean Ans=evenOdd(num);
		if (Ans==true)
		{
			System.out.println("its is even");
		}
		else
			System.out.println("it is odd");
	}


public static boolean evenOdd(int num)
{
	if (num%2 ==0)
	{
		return true;
	}
else
	{
		return false;
	}
}
}