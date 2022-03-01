package practice;

public class OddinString {

	public static void main(String[] args) {
		
		String s1= "a1b2c3d4";
		
		System.out.println("Odd num :");
		for (int i = 0; i < s1.length(); i++) {
			
			if(s1.charAt(i) >'0'&& s1.charAt(i)<='9'){
									
					int num=s1.charAt(i)-48;
					if(num%2==1) {
					
					System.out.println("Odd num :"+num);
					}
			}
		}

	}

}
