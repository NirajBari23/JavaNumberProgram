class Explain 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		//System.exit(1);
		m1(10);
		System.out.println("main ends");
	}

	public static void m1 (int a)
	{
		System.out.println("m1 starts");
		if (a%2==0)
		{
			System.out.println("even");
			return;
		}
		System.out.println("m1 ends");
	}
}
