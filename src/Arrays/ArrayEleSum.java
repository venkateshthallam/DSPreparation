package Arrays;

import java.util.HashMap;
import java.util.Hashtable;

public class ArrayEleSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={5,3,7,6,4,9,1,8};
		HashMap<Integer,Boolean> hc=new HashMap<Integer,Boolean>();
		for(int i=0;i<arr.length;i++){
			if(hc.containsKey(arr[i])){
				continue;
			}
			else{
				hc.put(arr[i], true);
			}
		}
		HashMap<Integer,Integer> pairs=new HashMap<Integer,Integer>();
		Hashtable<Integer,Integer> p=new Hashtable<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			if(hc.containsKey(10-arr[i])){
				
			}
			
		}
		

	}
	

}
