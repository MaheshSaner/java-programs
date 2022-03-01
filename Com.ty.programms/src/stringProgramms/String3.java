package stringProgramms;

public class String3 {

	public static void main(String[] args) {
		
		String str1="Windows";
		String str2="windows";
		
		Boolean bool=str1.equalsIgnoreCase(str2);
		
		if(bool) {
			System.out.println("values are equal");
		}
		else {
			System.out.println("Values are not Equal");
		}


	}

}
