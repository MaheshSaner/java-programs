package arraysPrograms;

public class StringVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str[]= {"abab","india"};
		
		for (int i = 0; i < str.length; i++) {
			String s=str[i];
			int count=0;
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u') {
					count++;
				}
				
				
			}System.out.println(s+" "+count);
		}
	}

}
