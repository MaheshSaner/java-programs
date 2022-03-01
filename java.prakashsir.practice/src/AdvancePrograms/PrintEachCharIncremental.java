package AdvancePrograms;

public class PrintEachCharIncremental {

	public static void main(String[] args) {


		String s="india";
	
		
		
		char[] sArr = s.toCharArray();  

		
		for(int i=0; i<sArr.length; i++) {
			
			for(int j=0; j<=i; j++) {
				
				System.out.print(sArr[j]);
			}
			
			System.out.println();
				
		}                     
		
		
		 String rev = "";
		 
		 for (int i = 0; i < s.length(); i++) {
			rev = rev+ s.charAt(i);
			System.out.println(rev);
		}
				 
	}

}
