package strings.practice;

import java.util.LinkedHashSet;

public class DeleteDuplicate {

	public static void main(String[] args) {


		//String s = "Hello world";
	
		/*
		HashSet set=new HashSet<>();
		
		for(int i=0;i<s.length();i++) {
			
			set.add(s.charAt(i));
		}

		//System.out.println(set);
		
		for(Object ch:set) {
			System.out.print(ch);
		}
	*/
	
	
	
	String s = "Hello world";
	
	LinkedHashSet set=new LinkedHashSet(); 
	
	for(int i=0;i<s.length();i++) {
		
		set.add(s.charAt(i));
	}

	//System.out.println(set);
	
	for(Object ch:set) {
		System.out.print(ch);
	}
}

}
