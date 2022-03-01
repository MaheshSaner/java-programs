package strings.practice;

import java.util.LinkedHashSet;

public class OccuranceOfWords {

	public static void main(String[] args) {
		
		String s="Hello world Hello all welcome to ty";
		
		String[] sArray = s.split(" ");
		System.out.println(sArray.length);

		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		// this for loop to add string values to set
		for(String word1:sArray) {
			set.add(word1);
		}
		
		
		//this for loop to iterate set
		for(String word2:set) {
			
			int count=0;
			
			
			//this for loop to iterate array
			for(String word3:sArray) {
				 
				if(word2.equals(word3)){
					count++;
				}
			}
			
			System.out.println(word2+" "+count);
		}
	}

}
			