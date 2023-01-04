package day4.str;

public class ForEachDemo {

	public static void main(String[] args) {
		
		int arr[] = {15,85,65,10};
		
		for(int i = 0;i<4;i++)
		{
			System.out.println(arr[i]);
		}
		
		// --------------------------------------
		
		System.out.println("\n--------------------\n");
		
		for (int abc : arr) {
			System.out.println(abc);
		}
		
	}
}
