package starPatterns;

public class StarPattern4 {

	public static void main(String[] args) {
/*
             *
            **
           ***
          ****
     
 */

		//1st for loop for no of rows
             for (int i = 1; i <=4; i++) 
             {
	
            	 //nested for loop for empty spaces
            	 for(int j=3;j>=i;j--) {
            		 System.out.print(" ");
            	      }
            	
            	
            	 
            	 //this for loop for printing the star
            	 for (int k = 1; k<=i; k++) {
            		 System.out.print("*");
				   }
            	 System.out.println();
            	 
             }
}
	
}


