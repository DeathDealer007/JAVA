import java.util.*;
class ShoppingCart
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String address = sc.next();
		String cartValue = sc.next();
		if( cartValue != null && address != null){
			System.out.println("Allowed");
		}
		else{
			System.out.println("Not Allowed");
		}
	}
}
