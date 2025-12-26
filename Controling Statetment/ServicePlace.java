import java.util.*;
class ServicePlace 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		System.out.print("Enter your gender m/f: ");
		char gender = sc.next().charAt(0);
		
		if(gender == 'f'){
			System.out.println("Urbanareas only");
		}
		else if (gender == 'm' && age>20 && age<40)
		{
			System.out.println("Can work anywahere");
		}
		else if (gender == 'm' && age>40 && age<60)
		{
			System.out.println("Urban areas");
			
		}
		else {
			System.out.println("Error");
		}
		
		System.out.println("Hello World!");
	}
}
