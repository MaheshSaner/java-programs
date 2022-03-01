package arraysPrograms;

public class PrimeNoWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {2,3,4,5,7,9};
		
		for(int i=0;i<a.length;i++) {
			
			
			int n=a[i];
			int j;
			int count=0;
			for(j=1;j<=a.length;j++) {
				if(n%j==0)
				{count++;

					
				}
				
				
				
			}
			if(j==n) {
				System.out.println("prime no");
			}
			else
				System.out.println("non prime");
			
		}

	}

}
