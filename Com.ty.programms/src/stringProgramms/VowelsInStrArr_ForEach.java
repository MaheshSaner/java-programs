package stringProgramms;

public class VowelsInStrArr_ForEach {

	public static void main(String[] args) {
		
		String [] arr= {"rakshit","chat", "zoom"};
		
		
		for(String s:arr) {
			
			int count=0;
			
			for(int i=0; i<s.length();i++) {
				if(s.charAt(i)=='a'||
				   s.charAt(i)=='e'||
				   s.charAt(i)=='i'||
				   s.charAt(i)=='o'||
				   s.charAt(i)=='u') {
					count++;
				}
				
			}
			
			System.out.println("Vowels for "+s+" are "+count);
		}

	}

}
