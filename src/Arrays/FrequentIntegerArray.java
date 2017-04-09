package Arrays;

import java.util.HashMap;

public class FrequentIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={11,2,13,2,15,11,2,17,18,11,13,11,2};
		int freqEle=new FrequentIntegerArray().findFreqInt(arr);
		System.out.println("freqEle is "+freqEle);
		

	}
	
	int findFreqInt(int[] arr){
		HashMap<Integer,Integer> fc=new HashMap<Integer,Integer>();
		int temp,maxval=0,maxkey=0;
		for(int i=0;i<arr.length;i++){
			if(fc.containsKey(arr[i]))
			{
				temp=fc.get(arr[i]);
				temp++;
				if(temp>=maxval){
					maxval=temp;
					maxkey=arr[i];
				}
				fc.put(arr[i], temp);
				
			}
			else{
				fc.put(arr[i], 1);
			}
		}
		
		
		return maxkey;
	}

}
