import java.util.*;
class  MaxElement

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int max = 0;
		for(int i = 0; i < arr.length; i++)
			{
			System.out.println("Enter the element"+ (i+1)+ ": ");
			arr[i] = sc.nextInt();
			}
		for(int i = 0; i<size; i++){
			max = arr[i];
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println("Max is: "+max);
		
	}
}