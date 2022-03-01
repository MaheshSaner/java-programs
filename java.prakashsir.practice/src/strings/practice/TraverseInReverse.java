package strings.practice;

public class TraverseInReverse {

	public static void main(String[] args) {


		String s= "mahesh";

		String reverse="";

		for(int i=s.length()-1; i>=0; i--) {
			reverse = reverse+s.charAt(i);
			
		}

		System.out.print(reverse);





	}

}
