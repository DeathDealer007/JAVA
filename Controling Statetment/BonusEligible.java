import java.util.*;
class BonusEligible 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Experience year: ");
		int years = sc.nextInt();
		System.out.print("Ratings 1-5: ");
		int rating = sc.nextInt();
		
		if(years>=5 && rating >=4){
			System.out.println("Bonus Eligible");
		}else{
		System.out.println("No Bonus");
		}
	}
}
