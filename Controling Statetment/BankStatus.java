import java.util.Scanner;

class BankStatus  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Balance: ");
		int balance = sc.nextInt();
		int min_balance = 1000;
		System.out.println("flag true/false ");
		Boolean flag = sc.nextBoolean();
		 
		if(flag){
		if (balance >= min_balance)
		{
			System.out.println("Active"); 
		}
		else if (balance < min_balance)
		{
			System.out.println("Low balance");
			
		}
		}
		else{
			System.out.println("Frozen");
		}
	}
}
