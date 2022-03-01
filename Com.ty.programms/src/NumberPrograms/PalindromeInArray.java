package NumberPrograms;

public class PalindromeInArray {

	public static void main(String[] args) {
		
		int [] a= {44,98,67,99,32,12};  //343 
		
		System.out.println("Palindrome Numbers from array are :");
		for (int i = 0; i < a.length; i++) {
			
			int num=a[i];
			
			int temp=num;
			int sum=0;
			
			while(num!=0) {
				int digit = num%10;
				sum=sum*10+digit;
				
				num=num/10;
				
		            }
			
			   if(sum==temp) {
				   
				   System.out.print(sum+" ");
				   
			   }		
		}		

	}

}
