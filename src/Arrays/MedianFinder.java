package Arrays;

public class MedianFinder {

	public static void main(String[] args) {
		int[] arr={10,0,8,2,-1,12,11,3};
		int gap=returnGap(arr);
		System.out.println(" Gap is ="+gap);
		
	}
	
	public static int returnGap(int[] arr){
		int length=arr.length;
		System.out.println(length);
		int middle=(length)/2;
		int k=selectKth(arr,middle);
		int m=selectKth(arr,middle-1);
		int median=(k+m)/2;
		System.out.println("k and m are "+k+" "+m);
		System.out.println("median is ="+median);
		int gap=Math.abs(Math.min(k-median,m-median));
		System.out.println("Gap is = "+gap);
		
		return gap;
	}

	public static int selectKth(int[] arr, int k) {
		 if (arr == null || arr.length <= k)
		  throw new Error();
		 
		 int from = 0, to = arr.length - 1;
		 
		 // if from == to we reached the kth element
		 while (from < to) {
		  int r = from, w = to;
		  int mid = arr[(r + w) / 2];
		 
		  // stop if the reader and writer meets
		  while (r < w) {
		 
		   if (arr[r] >= mid) { // put the large values at the end
		    int tmp = arr[w];
		    arr[w] = arr[r];
		    arr[r] = tmp;
		    w--;
		   } else { // the value is smaller than the pivot, skip
		    r++;
		   }
		  }
		 
		  // if we stepped up (r++) we need to step one down
		  if (arr[r] > mid)
		   r--;
		 
		  // the r pointer is on the end of the first k elements
		  if (k <= r) {
		   to = r;
		  } else {
		   from = r + 1;
		  }
		 }
		 
		 return arr[k];
		}

}
