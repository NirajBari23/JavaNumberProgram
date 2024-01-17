class Ex 
{
	public static void main(String[] args) 
	{
		/*int a =999;
		while (a!=0)
		{
		  int ct = count(a);
		  		System.out.println(ct);
		}*/
		count(999);

	}

	public static int count (int num)
	{
		int count = 0;
		while (num!=0)
		{
			count ++;
			num/=10;
		}
		
	}
}
