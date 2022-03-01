package numberPatterns;

import java.util.Iterator;

public class Pattern1 {

	public static void main(String[] args) {
		
	/*	
		a
		ab
		abc
		abcd
		abcde          */
		
		
		        
		
		for (int i = 0; i <5; i++) {
			
			for (int j = 0; j <5; j++) {
				
				if(i>=j)
				System.out.print((char)('a'+j)+"");
			}
			
			System.out.println();
		}

	}

}
