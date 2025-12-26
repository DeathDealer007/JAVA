class AppAccess 
{
	public static void main(String[] args) 
	{
		Boolean ban = true;
		int age = 12;
		String res = (ban == false && age >=18)?"Can Access":"Cant Access";
		System.out.println(res );
	}
}
