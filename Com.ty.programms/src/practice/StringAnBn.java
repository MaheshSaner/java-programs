package practice;

public class StringAnBn {

	public static void main(String[] args) {
			
		String s= "aaabb";
		
		boolean value=isAnBn(s);
		
		if(value==true) {
			System.out.println("yes");
		}
		else
			System.out.println("No");
	
	}

    public static boolean isAnBn(String str) {
		
    	int l= str.length();
    	
    	if(l%2==1) {
    		return false;
    	}
    	    	
    	int i=0;
    	int j=l-1;
    	     // i    0 1 2
    	     // j    4 3 2
    	while(i<j) {
    		
    		if(str.charAt(i)!='a' || str.charAt(j)!='b') {
    			return false;
    		}
    		i++;
    		j--;
    		    		
    	}
    	return true;
    	    	
    }
}