class MovTicket 
{
	public static void main(String[] args) 
	{
		Boolean Availability = true;
		Boolean Promo = true;
		Boolean Membership = true;
		String res = (Availability == true & Promo == true || Membership == true)?"Booking Allowed":"Booking Not Allowed";
		System.out.println(res);
	}
}
