import java.util.Scanner;
class CabBooking 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Boolean driverAvail = true;
		Boolean locationServiceable = true;
		Boolean payModeSelected = true;
		if( driverAvail && locationServiceable && payModeSelected){
			System.out.println("Cab Booking Available");
		}
		else{
			System.out.println("Cab Cannot be booked");
		}
		
	}
}
