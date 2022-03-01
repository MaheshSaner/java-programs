package Day3Programs;

public class PrintMinSizeStringFromStrArr {

	public static void main(String[] args) {
	
		String[] str = {"shailesh","mahesh","pradeep","vishnu","meesaq"};
		

		String minEle=str[0];
		
		for(int i=0; i<str.length;i++) {
			
			if(minEle.length()>str[i].length()) {
				minEle=str[i];
			}
		}
		System.out.println(minEle);
		
		for(int i=1; i<str.length;i++) {
			
			if(minEle.length()==str[i].length()) {
				System.out.println(str[i]);
			}
			
		}
	}

}
