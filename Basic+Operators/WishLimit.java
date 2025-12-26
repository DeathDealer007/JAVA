class WishLimit 
{
	public static void main(String[] args) 
	{
		int wishlistCount = 99;

		String result = (wishlistCount < 100) ? "Item added to wishlist" : "Wishlist limit reached";
		System.out.println(result);

	}
}
