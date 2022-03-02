package practice.collection;

import java.util.LinkedList;

public class ReverseInLinkedList {

	public static void main(String[] args) {
		
		
		LinkedList<Object> llarr = new LinkedList<Object>();

		llarr.add("mahesh");
		llarr.add(123);
		llarr.add("saner");
		llarr.add("mahesh");
		llarr.add(null);
		llarr.add(null);
		llarr.add(23.87);
		llarr.add(988l);
		llarr.add("mahesh");
	
		for (int i =llarr.size()-1; i >=0; i--) {
			
			System.out.println(llarr.get(i));
		}
	}

}
