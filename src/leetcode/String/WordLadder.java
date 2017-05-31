package src.leetcode.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordLadder {

	public static void main(String[] args) {
		String beginWord = "hit";
		String endWord = "cog";
		List<String> wordList = new ArrayList<String>(Arrays.asList("hot","dot","dog","lot","log","cog"));
		System.out.println(ladderLength(beginWord, endWord, wordList));

	}
	
	
	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
		int[] matchedChars = new int[beginWord.length()];
		String nexts = findNextInSequence(beginWord,endWord,matchedChars);
		
		
		return 0;
    }
	
	private static String findNextInSequence(String beginWord, String endWord, int[] matchedChars){
		
		
		return null;
	}

}
