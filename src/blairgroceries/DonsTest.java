package blairgroceries;

import com.google.gson.Gson;

public class DonsTest {

	public static void main(String[] args) {
	
		System.out.println("Hello World");
		CurItems curItem = new CurItems("Smart balance", 1, "No comment");
		System.out.println(curItem.toString());
		String s = curItem.get("*");
		System.out.println(s);
				
		Gson gson = new Gson();
		CurItems c2 = gson.fromJson(s, CurItems.class);
		System.out.println(c2.toString());
		
		System.out.println("The end");
		
	}	

	
}
