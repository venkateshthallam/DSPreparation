package src.Random;

import java.util.HashSet;

public class RemoveVowels {

	public static void main(String[] args) {
		String input="Venkatesh Thallam is a nice guy";
		System.out.println(new RemoveVowels().removeVowels(input));
		System.out.println(new RemoveVowels().removeVowelsWithOutUsingMethods(input));
	}
	
	public String removeVowels(String input){
		return input.replaceAll("[AaEeIiOoUu]", "");
		}
	
	public String removeVowelsWithOutUsingMethods(String input){
		StringBuilder output=new StringBuilder();
		char[] vowels={'A','a','E','e','I','i','O','o','U','u'};
		HashSet hs=new HashSet();
		for(char c:vowels){
			hs.add(c);
		}		
		for(int i=0;i<input.length();i++)
		{
			if(!hs.contains(input.charAt(i))){
				output.append(input.charAt(i));
			}
			i++;
		}
		return output.toString();
	}
}
