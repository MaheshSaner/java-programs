package Day3Programs;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		
		String str="welcome to ty";    //op- emoclew ot yt
		
		String[] strArr = str.split(" ");  // converting string into string array
		
		//for loop to access or iterate each element of string array
		for (int i = 0; i < strArr.length; i++) {
			
			//assiging the first element to ref var
			String s = strArr[i];
			
			//for loop to reverse string present in ref variable
			for(int j=s.length()-1; j>=0;j--) {
				System.out.print(s.charAt(j));
			}
			
			System.out.print(" ");
		}

	}

}
