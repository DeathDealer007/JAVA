class TransactionPermit 
{
	public static void main(String[] args) 
	{
		double balance = 10000;
		double amount =2000;
		boolean active = true;
		String res = (amount<balance && active == true)?"Permitted":"Not permitted";
		System.out.println(res);
	}
}
