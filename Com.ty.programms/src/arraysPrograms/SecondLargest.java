package arraysPrograms;

public class SecondLargest {

	public static void main(String[] args) {
		int [] a= {1,35,87,47,96,47,28,64};
		
		int max=0;
		int secmax=0;
		
		for (int i = 0; i < a.length; i++) {
			
			// a[i]     1 35 87
			// max      0  1    
			 
			if(a[i]>max) {
				secmax=max;
				max=a[i];
				
				 if(a[i]>secmax && a[i]<max) {
					 secmax=a[i];
				}
			}		
		}
		
		System.out.println("Largest Number is "+max);
		System.out.println("Sec. Largest Number is "+secmax);
	}
	
}
