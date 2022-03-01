package numberPatterns;

import java.util.Iterator;

public class pattern3 {
/*
 a
 bc
 def
 ghij
 klmno
 
 */
	public static void main(String[] args) {
		
		int n=5;
		char ch='a';
		
		for (int i = 0; i < n; i++) {
						
			for (int j = 0; j < n ;j++) {
				
				if(i>=j) {
					System.out.print(ch++);
				}
				
			}
			
			System.out.println();
		}
		
		

	}

}
