package arraysPrograms;

public class MissingElement {

	public static void main(String[] args) {
		
		int a[]= {8,15,20,22,30};
		
		for (int i = 0; i < a.length-1; i++) {
			
			for (int j = a[i]; j < a[i+1]; j++) {
				
				System.out.print(j+" ");
			}
			
			
		}
		

	}

}
