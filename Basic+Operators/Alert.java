class Alert 
{
	public static void main(String[] args) 
	{
		int attempt = 2;
		Boolean locked = true;
		String res = (attempt >3 && locked == false)?"Alert":"No alert";
		System.out.println(res);
	}
}
