package stringProgramms;

public class String1 {

	public static void main(String[] args) {
		
		String str1="Windows";
		String str2="Windows";
		

		if(str1==str2) {
			System.out.println("duplication is not allowed same address");
		}
		else {
			System.out.println("duplication allowed different address");
		}
		
		String str3 = new String("Android");
		String str4 = new String("Android");
		

		if(str3==str4) {
			System.out.println("duplication is not allowed & same address");
		}
		else {
			System.out.println("duplication allowed different address");
		}
	}

}
