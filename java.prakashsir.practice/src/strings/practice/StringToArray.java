package strings.practice;

public class StringToArray {

	public static void main(String[] args) {
		
		String s= "M A H E S H";
		
		char[] ch= s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}

	}

}
