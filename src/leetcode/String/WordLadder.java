package src.leetcode.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
This algorithm does a bi-directional search. 
1. Replace each char of the start word with every char from a to z to check if there's a match with the given word list.
2. Add all the matches to a temp, assign it to the start list,so that we repeat the process from the next step/word in the transformation sequence.
3. During each traversal, check if we reach the end state, if yes, return the length of the transformation.

Time Complexity : 26 * O(len(beginWord) * len(endWord))


*/
public class WordLadder {

	public static void main(String[] args) {
		String beginWord = "hit";
		String endWord = "cog";
		List<String> wordList = new ArrayList<String>(Arrays.asList("hot","dot","dog","lot","log","cog"));
		Set<String> wordSet = new HashSet<>(wordList);
		System.out.println("my code's response is "+ladderLength(beginWord, endWord, wordList));
		//System.out.println(ladderLength(beginWord, endWord, wordSet));

	}
	
	
	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
		Set<String> dict = new HashSet<>(wordList);
		Set<String> start = new HashSet<>();
		Set<String> end = new HashSet<>();
		Set<String> visited = new HashSet<>();
		int steps = 1;
		start.add(beginWord);
		end.add(endWord);
		while(!start.isEmpty() && !end.isEmpty()){
			//Reversing the direction of the search to minimize the no of iterations
			if(start.size() > end.size()){
				Set<String> temp = start;
				start = end;
				end = temp;
			}
			Set<String> tempSet = new HashSet<>();
			for(String s : start){
				char[] carr = s.toCharArray();
				for(int i=0;i<carr.length;i++){
					
					for(char t='a';t <= 'z';t++){
						
						char c = carr[i];
						carr[i] = t;
						String target = String.valueOf(carr);
						if(end.contains(target)){
							return steps+1;
						}
						if(dict.contains(target) && !visited.contains(target)){
							tempSet.add(target);
							visited.add(target);
						}
					carr[i] = c;
						
					}
				}
			}
			steps++;
			start = tempSet;
			
		}
		
		return 0;
    }
}
