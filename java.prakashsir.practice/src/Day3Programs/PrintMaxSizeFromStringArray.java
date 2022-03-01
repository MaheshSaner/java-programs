package Day3Programs;

public class PrintMaxSizeFromStringArray {

	public static void main(String[] args) {


		String [] str = {"a","ab","abc","abcd","edhf"};
		
		String max= str[0];
		
		for(int i=0; i<str.length;i++) {
			
			if (max.length()<str[i].length()) {
				
				max=str[i];
				
			} 
			
		}
		System.out.println(max);
		
		for (int i = 0; i < str.length; i++) {
			if(max.length()==str[i].length()) {
				System.out.println(str[i]);
			}
		}

	}

}
