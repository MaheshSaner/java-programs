package strings.practice;

public class ReverseStringUsingCompareTo {

	public static void main(String[] args) {


		String s1 ="Mahesh";
		String s2="";
		
		
		int length =s1.compareTo(s2);
		System.out.println("length of string is="+length);

		String reverse="";
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+s1.charAt(i);
		}
		
		System.out.println(reverse);
	}

}
