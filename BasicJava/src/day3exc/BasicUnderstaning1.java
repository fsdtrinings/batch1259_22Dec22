package day3exc;

public class BasicUnderstaning1 {

	public static void main(String[] args) {
		
		BasicUnderstaning1 obj = new BasicUnderstaning1();
		obj.case1();
		//obj.case2();
		
	}
	
	public void case1()
	{
		int arr[] = new int[3];
		
		arr[2] = 88;
		
		System.out.println("A");
		System.out.println(arr[3]);
		System.out.println("B");
	}
	public void case2()
	{
		int arr[] = new int[3];
		
		arr[2] = 88;
		
		System.out.println("A");
		try {
			System.out.println(arr[3]);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("B");
	}
	
}
