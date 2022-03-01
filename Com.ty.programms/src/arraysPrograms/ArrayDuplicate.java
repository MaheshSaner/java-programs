package arraysPrograms;

public class ArrayDuplicate {

	public static void main(String[] args) {
		
		int [] a= {17,65,34,96,87,46,96,25,17};
		
	
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println(a[i]);
				}
			}
		}
		

	}

}
