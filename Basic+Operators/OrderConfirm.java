class  OrderConfirm
{
	public static void main(String[] args) 
	{
		Boolean payment = true;
		Boolean Stock_Avail = true;
		Boolean back_order_Avail = true;
		String res = (payment == true & Stock_Avail == true || back_order_Avail == true)?"Confirm":"Not Confirm";
		System.out.println(res);
	}
}
