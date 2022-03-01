package AdvancePrograms;

public class SwapFirstAndLastWord {

	public static void main(String[] args) {


		String s ="welcome to india";
		System.out.println(s.length());
		
		String[] str=s.split(" ");
		System.out.println(str.length);

		String temp=str[0];
		
		str[0]=str[str.length-1];
		
		str[str.length-1]=temp;
		
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
		
//		for(String st:str) {
//			System.out.print(st+" ");
//		}
//		
	}

}
