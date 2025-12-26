class FraudCheck 
{
	public static void main(String[] args) 
	{
		double orderAmount = 10000;
		double averageOrderValue = 6000;

		String result =(orderAmount > averageOrderValue) ? "Order flagged" : "Order normal";

		System.out.println(result);

		
	}
}
