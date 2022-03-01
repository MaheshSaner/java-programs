package array.practice;

public class SumOf3MinNums {

	public static void main(String[] args) {


   int[] arr = {2,1,4,3,7,5};
		
   for(int i=0; i<arr.length; i++) {
	   System.out.print(arr[i]+" ");
   }
   
   System.out.println();
   System.out.println("length of array="+arr.length);
   
   
		//iterate over the given the array
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				//compare the numbers 
				if(arr[i]>arr[j]) {
					
					//if 1st number is bigger than 2nd , swap it
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
		
		System.out.println(); 

		//sum of 3 min nums
		int sum=0;
		for(int i=0;i<3;i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum of 3 min nums="+sum);
	}

}
