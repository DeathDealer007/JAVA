import java.util.Scanner;

class DispalyShapes1
{
	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		int value;
		do
		{
		System.out.println("Select the shape \n 1. Rectangle \n 2. Square \n 3. Exit");
		value = s.nextInt();
		
		
		switch(value){
			case 1:
				System.out.println("Enter l");
				double l = s.nextDouble();
				System.out.println("Enter b");
				double b = s.nextDouble();
				System.out.println(Rec(l,b));
				break;
			case 2:
				System.out.println("Enter s");
				double s1 = s.nextDouble();
				System.out.println(square(s1));
				break;
		}
		
		}while (value!=3);
	}
	public static double Rec(double l, double b){
		return l*b;
	}
	public static double square(double s){
		return s*s;
	}
	
	
}