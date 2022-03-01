package arraysPrograms;

public class ArrayVowel {

	public static void main(String[] args) {
		
		char [] ch= { 'm','a','h','e','s','h'};
		
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
				
				System.out.println("Vowels is :"+ch[i]);
			}
		}

	}

}
