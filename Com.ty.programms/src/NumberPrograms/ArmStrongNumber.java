package NumberPrograms;

import java.util.Scanner;

      //  371  =3^3+ 7^3+ 1^3  
      //       =27+343+1
      //       =371

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz Enter the number");
		int num= sc.nextInt();
		
		int temp=num;
		int count=0;
		
		//------count the digits
		
		while(temp!=0) {
			count++;
			temp=temp/10;
		}
	
		temp=num;
		int result=0;
		while(num!=0) {
			int digit=num%10;
			result=result+pow(digit,count);
			num=num/10;
		}
		
		if(result==temp) {
			System.out.println("Given Number is ArmStrong Number");
		}
		else {
			System.out.println("Not a ArmStrong Number");
		}

	}
	
	public static int pow(int num,int pw) {
		
	
		int result=1;
		for (int i = 1; i <=pw; i++) {
			result=result*num;
		}
		return result;
	}

}


     
    	  
	

