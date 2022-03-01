package numberPatterns;

public class Pattern2 {

	public static void main(String[] args) {
		
		/*
		 a 
		 bb
		 ccc
		 dddd
		 eeeee
		 
		 */
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				if(i>=j) {
					
					System.out.print((char)('a'+i));
				}
				
			}	
			
			System.out.println();
			
		}

	}

}
