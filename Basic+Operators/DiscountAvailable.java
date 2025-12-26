class DiscountAvailable 
{
	public static void main(String[] args) 
	{
		char pre = 'y';
		double c_value = 2000;
		String res = (pre == 'y' || c_value >= 5000)?"Avail":"Not Avail";
		System.out.println(res);
	}
}
