package src.leetcode.Arrays;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class ReconstructItenirary {

	public static void main(String[] args) {
		String[][] itenirary = {{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};
		//String[][] itenirary = {{"JFK","ATL"},{"ATL","JFK"}};
		System.out.println(findItinerary(itenirary));
	}
	
	public static List<String> findItinerary(String[][] tickets) {
	    Map<String, PriorityQueue<String>> targets = new HashMap<>();
	    for (String[] ticket : tickets)
	        targets.computeIfAbsent(ticket[0], k -> new PriorityQueue()).add(ticket[1]);
	    List<String> route = new LinkedList();
	    Stack<String> stack = new Stack<>();
	    stack.push("JFK");
	    while (!stack.empty()) {
	    	System.out.println("Stack now is "+stack);
	        while (targets.containsKey(stack.peek()) && !targets.get(stack.peek()).isEmpty()){
	        	System.out.println(targets.get(stack.peek()));
	            stack.push(targets.get(stack.peek()).poll());
	        }
	        route.add(0, stack.pop());
	    }
	    return route;
	}

}
