package array.practice;

public class SumOf3MaxNums {

	public static void main(String[] args) {
		
int [] arr = {1,4,9,7,10,3,4};
		
		//iterate over the given the array
				for(int i=0; i<arr.length; i++) {
					
					for(int j=i+1; j<arr.length; j++) {
						
						if(arr[i]<arr[j]) {
							int temp=arr[i];
							arr[i]=arr[j];
							
							arr[j]=temp;
							
						}
					}
					
					System.out.print(arr[i]+" ");
					
				}
				System.out.println();
				System.out.println("length of array="+arr.length); 
				
				int sum=0;
				for(int i=0; i<3;i++) {
					sum=sum+arr[i];
				}
				System.out.println("sum of 3 max nums ="+sum);
				System.out.println();
				
			//1st way	
				int sum1=0;
				for(int i=arr.length-3; i<arr.length; i++) {
					sum1=sum1+arr[i];
				}
				System.out.println("sum of 3 min nums ="+sum1);
				
			//2nd way
				int sum2=0;
				for(int i=arr.length-1; i>arr.length-4; i-- ) {
					sum2=sum2+arr[i];
				}
				System.out.println("sum of 3 min nums ="+sum2);
	}

}
