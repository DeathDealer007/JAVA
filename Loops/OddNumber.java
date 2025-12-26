import java.util.*;

class OddNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number N: ");
		int n = sc.nextInt();
		System.out.print("Enter a number M: ");
		int m = sc.nextInt();
		for( int i=n; i<=m;i++)
			{
				if(i%2!=0){
					System.out.println(i);
				}
			}
		
	}
}
