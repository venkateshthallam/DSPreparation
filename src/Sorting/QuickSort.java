package src.Sorting;

public class QuickSort 
{
	public static void main(String[] args){
		int[] arr={23,76,89,56,44};
		new QuickSort().QuickSortImpl(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]+" ");
		
	}
	
	public void QuickSortImpl(int[] arr,int start,int end){
		if(start>=end)
			return;
		int pivot_index=partition(arr,start,end);
		QuickSortImpl(arr,start,pivot_index-1);
		QuickSortImpl(arr,pivot_index+1,end);
		
		
		
	}
	
	public int partition(int[] arr, int start, int end){
		int pivot=arr[start];
		
		while(start<end)
		{
			while(arr[start]<pivot)
				start++;
			while(arr[end]>pivot)
				end--;
			
			swap(arr,start,end);
		}
		
		
		return start;
	}
	
	public void swap(int[] arr,int x,int y){
		int temp;
		temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}

}
