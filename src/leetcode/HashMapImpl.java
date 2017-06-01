package src.leetcode;

import java.util.ArrayList;
import java.util.List;

public class HashMapImpl {
	
	private int capacity = 16;
	private int largePrime = 175365371;
	
	class Entry{
		int key;
		int value;
		public Entry(int key, int value) {
	        this.key = key;
	        this.value = value;
	    }
	}
	
	List<List<Entry>> mapStore = new ArrayList<>(capacity);
	
	public int get(int val){
		
		
		
		
		return 0;
	}
	
	public void put(int key, int value){
		int hash = getHashedKey(key);
		List<Entry> bucket = mapStore.get(hash);
		if(bucket==null){
			
		}
	}
	
	public int getHashedKey(int key){
		int hash = 0;
		return (key * largePrime)%capacity;
	}

	public static void main(String[] args) {
		
	}
	
	

}
