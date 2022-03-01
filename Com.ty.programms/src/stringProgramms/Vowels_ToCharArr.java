package stringProgramms;

public class Vowels_ToCharArr {

	public static void main(String[] args) {
		

		String [] arr= {"rakshit","chat", "zoom"};
		
		for (int i = 0; i <arr.length; i++) {
			
			char[] ch = arr[i].toCharArray();
			
			int count=0;
			for (int j = 0; j < ch.length; j++) {
			
				if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u') {
					count++;
				}
			}
			System.out.println(arr[i]+"-"+count);
			
		}

	}

}
