package arraysPrograms;

public class ArrayVowelCount {

	public static void main(String[] args) {
		
		char ch[]= {'m','a','h','e','s','h'};
		
		int count=0;
		
		for (int i = 0; i < ch.length; i++) {
		
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='u'||ch[i]=='u') {
				
				count++;
				 
				System.out.println("vowel is ="+ch[i]);
				
			}
			
		}

		System.out.println("Number of vowels are"+count);
		 
	}

}
