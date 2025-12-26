class DiscountEligible 
{
	public static void main(String[] args) 
	{
		int cartValue = 2500;

		String result = (cartValue > 2000) ? "Discount Applied" : "No Discount";
		System.out.println(result);
	}
}
