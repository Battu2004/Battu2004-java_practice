class demo
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=25;
		boolean res=(a==b||a!=b&&a==b);

		System.out.println("res="+res);
		 res=(a==b||a!=b&&a>b);
		System.out.println("res="+res);
		 res=(a==b||a!=b&&a<b);
		System.out.println("res="+res);
		 res=(a==b||a!=b&&a>=b);
		System.out.println("res="+res);
		 res=(a==b||a!=b&&a<=b);
		System.out.println("res="+res);
		 res=(a>b||a!=b&&a>b);
		System.out.println("res="+res);
		 res=(a>b||a!=b&&a<b);
		System.out.println("res="+res);
	}
}
