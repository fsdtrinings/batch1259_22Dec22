package day4.str;

public class StringDemos {
	
	public static void main(String[] args) {
		
		StringDemos mainObj = new StringDemos();
		//mainObj.trimDemo();
		//mainObj.concatDemo();
		
		mainObj.splitDemo();
	}
	
	
	
	
	public void splitDemo() {
		String str = "abc.123.hh.011";
		String arr[] = str.split("\\.");
		
		System.out.println(str+"\n\n");
		
		
		for (String abc : arr) {
			System.out.println(abc);
		}
		
		
	}




	public void concatDemo()
	{
		String str = "Ramesh";
		str = str.concat(" Kumar");
		System.out.println(str);
		
		System.out.println(str.endsWith("mar123"));
		
	}
	

	public void trimDemo()
	{
		String str = "   abc    ";
		int length = str.length();
		System.out.println("\n Length before Trim :-  "+length);
		str = str.trim();
		length = str.length();
		System.out.println("\n Length after Trim :-  "+length);
		
	}
	
	
}
