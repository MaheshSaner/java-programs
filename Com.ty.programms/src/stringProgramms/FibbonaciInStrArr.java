package stringProgramms;

public class FibbonaciInStrArr {

	public static void main(String[] args) {
		
		String s[]= {"a","try","aaaa","hello+"};
		
		for (int i = 0; i < s.length; i++) {
			
			int a=0;
			int b=1;
			
			int n= s[i].length();
			
			for (int j = 0; j <=n; j++) {
				
				int c =a+b;
				
				if(c==n) {
					System.out.println(s[i]+" yes");
					break;
				}
				
				else if(j==n) {
					System.out.println(s[i]+" No");
				}
				
				else {
					a=b;
					b=c;
				}
				
			}		
			
						
		}
					

	}

}
