package src.Sorting;

public class SortTestBed {

	public static void main(String[] args) {
		int[] nums={23,76,89,56,44,9,36};
		new SortTestBed().quickSort(nums, 0, nums.length-1);
		for(int i=0;i<nums.length;i++)
			System.out.println(nums[i]+" ");

	}
	
	/*Quick sort
	 * 1. Pick a pivot element.
	 * 2. Partition the array around it, swap the elements.
	 * 3. Repeat the process by passing the pivot as start or end 
	 * */
	private void quickSort(int[] nums, int start, int end){
		if(start>=end)
			return;
		int pivot = partition(nums, start, end);
		quickSort(nums, start, pivot-1);
		quickSort(nums, pivot+1, end);
		
	}
	
	private int partition(int[] nums, int start, int end){
		
		int pivot = start;
		while(start < end){
			while(nums[start]<nums[pivot])
				start++;
			while(nums[end] > nums[pivot])
				end--;
			swap(nums, start, end);
		}
		
		
		return start;
	}
	
	private void swap(int[] arr, int x, int y){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

}
