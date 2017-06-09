package src.leetcode.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindItinerary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] input = {{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}};
		String[][] input2 = {{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};
		System.out.println(findItinerary(input2));
	}
	
	 public static List<String> findItinerary(String[][] tickets) {
	        List<String> result = new ArrayList<>();
	        
	       
	        Map<String,List<String>> itmap = new HashMap<>();
	        for(int i=0;i<tickets.length;i++){
	            if(!itmap.containsKey(tickets[i][0])){
	            	 List<String> multiarrivals = new ArrayList<>();
	            	 multiarrivals.add(tickets[i][1]);
	                itmap.put(tickets[i][0],multiarrivals);
	            }else{
	            	List<String> temp = itmap.get(tickets[i][0]);
	            	temp.add(tickets[i][1]);
	                itmap.put(tickets[i][0],temp);
	            }
	        }
	        String key = "JFK";
	        result.add(key);
	        while(true){
	            if(itmap.get(key)!=null){
	            	List<String> temp = itmap.get(key);
	                if(temp.size()>1){
	                     Collections.sort(temp);
	                    result.add(temp.get(0));
	                }else{
	                    result.add(temp.get(0));
	                }
	                 key = itmap.get(key).get(0);
	            }else{
	                break;
	            }
	           
	        }
	        
	        return result;
	    
	    }

}
