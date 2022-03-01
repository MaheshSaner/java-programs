package strings.practice;

public class ReverseUsingForEachLoop {

	public static void main(String[] args) {


		String s ="Mahesh";
		
		
		char[] sToArray= s.toCharArray();
		int count =0;
	   //to get length of string	
		for(char ch : sToArray) {
			count++;
		}

		System.out.println("length of given array "+count);
	
	
		
	//to iterate using	
	for(int i=count-1;i>=0;i--) {
		System.out.println(sToArray[i]);
	}


}}