import java.util.*;
class CourseAccess 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(system.in);
		System.out.print("Fee paid: ");
		
		int feePaid = sc.nextInt();
		
		
		System.out.print("Scholarship true/false: ");
		Boolean scholarship = sc.nextBoolean();
		System.out.print("Date of Purchase: ");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.print("Date (dd-mm-yyyy): ");
		LocalDate d1 = LocalDate.parse(sc.nextLine(), formatter);
		if(feePaid == 10000){
			Boolean feepaid = true;
			if(feepaid || scholarship){
				if(d1.isbefore(31-12-2025) ){
					System.out.println("Course is accessible");
				}
				else{
					System.out.println("Expired");	
				
					}
			}
		}else{
			System.out.println("Not paid");
		
		}	
	}
}
