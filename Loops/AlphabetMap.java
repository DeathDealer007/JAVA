import java.util.*;
class AlphabetMap 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		for (int i = 1;i<=25 ;i++ )
		{
			if(a==i){
			System.out.println(i+":"+(char)(i+64)	);
			}
		}
		System.out.println("Hello World!");
	}
}
