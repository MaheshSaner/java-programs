package stringProgramms;

public class PalindromeString {

	public static void main(String[] args) {
	
		String s = "malayalam";
		
		System.out.println(isPalindrome(s));

	}

	private static Boolean isPalindrome(String s) {
		
		String temp=s;
		
		char ch[]=s.toCharArray();
		
		String rev = "";
		
		for (int i = 0; i < ch.length; i++) {
			rev=ch[i]+rev; 
		}
		System.out.println("rev-"+rev);
		
		if(rev.equals(temp)) {
			return true;
		}
		else {
			return false;
		}
	

		
		
	}

}
