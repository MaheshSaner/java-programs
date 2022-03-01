package stringProgramms;

public class InitCap {

	public static void main(String[] args) {
		
		String s1= "hi hello how are you";
		
		char[] ch = s1.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if(i==0 || (ch[i-1]==' ')) {
				
				if(ch[i]>='a'&& ch[i]<='z') {
					ch[i]=(char) (ch[i]-32);
					
				}
			}
			
			else if(ch[i]>='A'&&ch[i]<='Z') {
				
				ch[i]=(char) (ch[i]+32);
			}
			
			
		}

		
		String s2 = String.valueOf(ch);
	
		System.out.println(s2);
		
		
	}

}
