package arraysPrograms;

public class EqualArray {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5};
		int [] b= {1,2,3,4,5};
		
		equal(a,b);
	}
	
	public static void equal(int[]a,int[]b) {
		
		int count=0;
		
		if(a.length==b.length) {
			
			for (int i = 0; i < a.length; i++) {
				if(a[i]==b[i]) {
					count++;
				}
			}
			if(a.length==count) {
				System.out.println("equal Array");
			}
			else {
				System.out.println("Not a Equal");
			}
		}
		
		
	}
	
	

}
