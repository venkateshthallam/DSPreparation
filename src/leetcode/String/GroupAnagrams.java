package src.leetcode.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 1. Sort each string from the array and see if it matches with existing keys in the map, if yes add it to the list
 * 2. Else, create a key, add the string to the list.
 * 
 * Return all map values.
 * */
public class GroupAnagrams {
	
	public static void main(String[] args) {
		String[] s ={"and","dan"};
		System.out.println(groupAnagrams(s));

	}
	
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String keyStr = String.valueOf(ca);
            if(!map.containsKey(s)){
                map.put(keyStr,new ArrayList<String>());
            }
            map.get(keyStr).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
