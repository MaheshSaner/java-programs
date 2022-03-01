package stringProgramms;

public class CharArray {

	public static void main(String[] args) {
		
		String s1 = "harbhajan singh";
		
		char [] ch = s1.toCharArray();
		
		/*for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		} */ 
		
		String s3= new String(ch);
		
		System.out.println(s3);

	}

}
