package practice;

public class GrupCharsCount {

	public static void main(String[] args) {
		
		
		String s1 = "aabbbccccaa";    //a2 b3 c4 a2
		
		         //0 1
		for (int i = 0; i < s1.length(); i++) {    
			
			int count =1;
			
			
			    
			for (int j =i+1; j < s1.length(); j++) {
				                                        
				
				if(s1.charAt(i)==s1.charAt(j)) {
					count++;
					i++;
				}
				
				else 
				{
					break;
					
				}
				
						
			}
			System.out.println(s1.charAt(i)+" "+count);
			
			}
		
			
			
		}
		
	}


