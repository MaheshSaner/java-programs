package arraysPrograms;

public class EqualArray1 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,5};
		
		boolean bool=equ(a,b);
		System.out.println(bool);
	}
	
	public static boolean equ(int[]a,int[]b) {
		
		int count=0;
		if(a.length==b.length) {
			
			for (int i = 0; i < a.length; i++) {
				
				if(a[i]==b[i]) {
					count++;
				}
			}
		}
		
		if(a.length==count) {
			return true;
		}
		
		else
		return false;
		
	}

}
