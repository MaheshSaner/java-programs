package stringProgramms;

public class Swap2strings {

	public static void main(String[] args) {
		
		String s1="Hello";
		String s2="Hi";
		
		System.out.println("Before swapping s1="+s1+" & s2="+s2);
		
		//concate both the strings 
		s1=s1+s2;
		System.out.println(s1);
		//System.out.println(s1.length());
		
		//extract s1 from new s1 to store it in s2
		     //s1="HelloHi"   s1.substring(0,5)
		s2=s1.substring(0, (s1.length()-s2.length()));
		
		
		//extract length of s2 from new s1 to store it in s1
		
		                 //S2=hello   s2.length=5
		s1=s1.substring(s2.length());
		

		System.out.println("After Swapping s1="+s1+" & s2="+s2);
	}

}
