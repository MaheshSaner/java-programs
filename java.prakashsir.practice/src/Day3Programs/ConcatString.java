package Day3Programs;

public class ConcatString {

	public static void main(String[] args) {


		String s ="abc" + "xyz"; //  req. o/p==>"axbycz"
		System.out.println(s.length());
		
		System.out.println(s);
		
		//String sArr=s.split();

		for (int i = 0; i < s.length()/2; i++) {
			
			System.out.print(s.charAt(i)+""+s.charAt(s.length()/2+i));
			
		}
		

	}

}
