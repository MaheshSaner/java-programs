package collection.practice;

import java.util.HashSet;

public class DemoHashSet {

	public static void main(String[] args) {
		
		HashSet set = new HashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(110);
		set.add(106);
		set.add(10);
		set.add(null);
		set.add(null);
		set.add("Mahesh");
		
		System.out.println(set);
        //no insertion order
		//no duplicates
		//only one null
		//heterogeneous
		//randomly 
		
		
		
		
	}

}
