class Withdrawal 
{
	public static void main(String[] args) 
	{
		int Balance = 10000;
		int W_amount = 1000; 
		System.out.println((W_amount>0 && W_amount<Balance)?"Yes Withdrawable":"No Not Withdrawable");
	}
}
