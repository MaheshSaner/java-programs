package stringProgramms;

public class CountDuplicatesInString {

	public static void main(String[] args) {
		
		String s= "automation";
		
	   /*     
		for (int i = 0; i < s.length(); i++) {
			
			int count=0;
			for (int j = i+1; j < s.length(); j++) {
				
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if(count>=1) {
				System.out.println(s.charAt(i)+":"+count);
			}
		}*/
		
		char [] ch=s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			int count=0;
			
			  for (int j = i+1; j < ch.length; j++) {
				
				  if(ch[i]==ch[j]) {
					count++;
				}
			}
		}
	}

}


