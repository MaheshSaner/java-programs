package practice.collection;

public class PrintBigNumber {

	public static void main(String[] args) {
		
		int num=563;
		
		int a;
		int b;
		int c;
		
		a=num%10;
		num=num/10;
		
		b=num%10;
		num=num/10;
		
		c=num%10;
		

		System.out.println((a>b&&a>c)?a:(b>c)?b:c);
	}

}
