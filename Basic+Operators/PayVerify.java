class PayVerify 
{
	public static void main(String[] args) 
	{
		double paidAmount = 500.0;
		double orderAmount = 500.0;

		String result =(paidAmount == orderAmount) ? "Payment successful" : "Payment mismatch";
		System.out.println(result);

	}
}
