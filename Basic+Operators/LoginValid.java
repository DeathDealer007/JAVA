class LoginValid 
{
	public static void main(String[] args) 
	{
		String user = "akit";
		String pass = "ankit@123";
		String Res = (user != "" && pass !="")?"Active":"Not Valid";
		System.out.println(Res);
	}
}
