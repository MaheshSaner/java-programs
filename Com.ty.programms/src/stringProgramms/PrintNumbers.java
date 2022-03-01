package stringProgramms;

public class PrintNumbers {

	public static void main(String[] args) {
		
		String s ="AJ88888@gmail.com";
		char ch[]=s.toCharArray();
		
		int sum=0;
		int product=1;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='0'&& ch[i]<='9') {
				sum=sum+ch[i]-48;
				product=product*(ch[i]-48);
			}
			
		}
		System.out.println(sum);
		System.out.println(product);
		
		if(product%2==0) {
			System.out.println("Output is even");
		}
		else {
			System.out.println("output is odd");
		}
	}

}
