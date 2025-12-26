import java.util.*;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("1:Add, 2:Sub, 3:Multply, 4:Division: ");
		int op = sc.nextInt();
		System.out.print("Number1: ");
		int a = sc.nextInt();
		System.out.print("Number2: ");
		int b = sc.nextInt();
		
		switch(op){
			case 1:
				System.out.println("Sum: "+ (a+b));
			break;
			case 2:
				System.out.println("Diff: "+ (a-b));
			break;
			case 3:
				System.out.print("Product: "+ (a*b));
			break;
			case 4:
				System.out.print("Quotient: "+ (a/b));
			break;
			default:
				System.out.print("Invalid Input");
		}
		
		
	}
}
