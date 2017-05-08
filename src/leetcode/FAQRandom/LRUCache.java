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
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
