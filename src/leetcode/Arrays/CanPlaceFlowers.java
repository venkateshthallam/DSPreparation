package src.leetcode.Arrays;

public class CanPlaceFlowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] flowerbed = {1,0,0,0,1};
		System.out.println(canPlaceFlowers(flowerbed, 1));
	}
	
	 public static boolean canPlaceFlowers(int[] flowerbed, int n) {
	        int count = 0;
	        for(int i=0;i<flowerbed.length;i++){
	            if(flowerbed[i]==0){
	                if(i+2 < flowerbed.length && flowerbed[i+1]==0 && flowerbed[i+2]==0)
	                    count++;
	            }
	        }
	        
	        System.out.println("count is "+count);
	        return n<=count;
	    }

}
