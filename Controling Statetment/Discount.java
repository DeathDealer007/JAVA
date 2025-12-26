import java.util.*;
class Discount 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Cost of Purchased item: ");
		int cost = sc.nextInt();
		int quantity = sc.nextInt();
		int t_cost = cost*quantity;
		if(cost*quantity > 1000){
			System.out.println("Discount of 10%\n You need to pay: ");
			System.out.print((t_cost) - ((t_cost)*0.1) );
		}
		else
			{
			System.out.println("No Discount\nAmount: "+t_cost );
			}
		
		
	}
}
