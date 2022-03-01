package numberPatterns;

public class Pattern4 {

	public static void main(String[] args) {
		
		/*
		 
		 a
         bc
         cde
         defg
         efghi
         
		 */
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
								
				if(i>=j) {
					System.out.print((char)('a'+i+j));
				}
			}
			
			System.out.println();
		}

	}

}
