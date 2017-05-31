package src.leetcode.FAQRandom;

import java.util.Hashtable;

public class LRUCache {
    

	class DNode{
	    int key;
	    int value;
	    DNode pre;
	    DNode post;
	}
	
	private DNode head, tail;

	private void addNode(DNode node){
		node.pre = head;
		node.post = head.post;
		
		head.post.pre = node;
		head.post = node;
		
	}
	
	private void removeNode(DNode node){
		DNode pre = node.pre;
		DNode post = node.post;
		
		pre.post = post;
		post.pre = pre;
	}
	
	private void moveToHead(DNode node){
		
		this.removeNode(node);
		this.addNode(node);
		
		
	}
	
	private DNode popTail(){
		DNode temp = tail.pre;
		this.removeNode(temp);
		return temp;
	}
	
	private Hashtable<Integer,DNode> cache = new Hashtable<Integer,DNode>(); 
	private int count, capacity;
	 
	public LRUCache(int capacity){
		this.count = 0;
		this.capacity = capacity;
		
		head = new DNode();
		head.pre = null;
		
		tail = new DNode();
		tail.post = null;
		
		head.post = tail;
		tail.pre = head;
	}
	
	public int get(int key){
		
		DNode node = cache.get(key);
		if(node == null)
			return -1;
		
		this.moveToHead(node);
		
		return node.value;
		
	}
	
	public void put(int key, int value){
		
		DNode node = cache.get(key);
		
		if(node == null){
			
			DNode newNode = new DNode();
			newNode.key = key;
			newNode.value = value;
			
			this.cache.put(key, newNode);
			this.addNode(newNode);
			
			++count;
			
			if(count > capacity){
				DNode tail = this.popTail();
				this.cache.remove(key);
				--count;
				
			}
			
		}else{
			node.value = value;
			this.moveToHead(node);
		}
		
	}
	
	public void printCache(){
		System.out.println(cache.keySet());
		for(int key : cache.keySet()){
			System.out.println(key+", ");
		}
	}
	
	public static void main(String[] args){
		
		LRUCache cache = new LRUCache(2);
		
		cache.put(1, 1);
		cache.put(2, 2);
		cache.put(3, 3);
		cache.get(2);
		cache.put(4, 4);
		
		cache.printCache();
		

		
	}
}

