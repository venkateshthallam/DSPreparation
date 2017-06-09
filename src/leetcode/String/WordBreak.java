package src.leetcode.String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
1. Checks for all possible entries and changes the flag to true if a word is found at a certain index.
2. The checking in the dictionary happens only if a word has been found at the current 'j' location.
3. If a string has all words, then the last 'true' should be at the end, since the 'i' index would be the length of the string at the end when substring itself is the full word.
*/
public class WordBreak {

	public static void main(String[] args) {
		String s = "goalspecial";
		List<String> dict = new ArrayList<>();
		dict.add("go");
		dict.add("goal");
		dict.add("special");
		System.out.println(wordBreak(s, dict));

	}

	public static boolean wordBreak(String s, List<String> wordDict) {
		if (s.length() == 0)
			return true;
		Set<String> dict = new HashSet<String>(wordDict);
		boolean[] dp = new boolean[s.length() + 1];
		dp[0] = true;
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (dp[j] && dict.contains(s.substring(j, i))) {
					dp[i] = true;
					break;
				}
			}
		}

		return dp[s.length()];
	}

}
