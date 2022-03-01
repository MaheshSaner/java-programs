package arraysPrograms;

public class LargestValueInArray {

	public static void main(String[] args) {
		
		
		int a[]= {1,4,8,55,76,62,45,19,78,98};
		
		int max=0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
		}
		
		System.out.println("Largest Values is = "+max);

	}

}
