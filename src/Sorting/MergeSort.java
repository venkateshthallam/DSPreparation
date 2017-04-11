package src.Sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={23,76,89,56,44};
		new MergeSort().MergeSortImpl(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]+" ");
	}
	
	public void MergeSortImpl(int[] arr,int start, int end){
		int[] temp=new int[arr.length];
		//System.out.println("array length is "+arr.length);
		
		if(start<end)
		{		
			int mid=start+(end-start)/2;
			
			MergeSortImpl(arr,start,mid);
			MergeSortImpl(arr,mid+1,end);
			
			Merge(arr,temp,start,mid,end);
		
		}
		
	}
	
	public static void Merge(int[] arr,int[] temp,int left,int middle,int right){
		//System.out.println("In the merge method");
		//int[] temp=new int[right-left+1];		
		int i=left,j=middle+1,k=left;
		for (int x = left; x <= right; x++) {
            temp[x] = arr[x];
        }
		//System.out.println("left="+left+"right="+right+"middle="+middle);
		while(i<=middle && j<=right)
		{
			if(temp[i]<temp[j])
			{
				arr[k]=temp[i];
				i++;
				
			}
			else if(temp[i]>temp[j]){
				arr[k]=temp[j];
				j++;
			}
			k++;
			while(i<left){
				arr[k]=temp[i];
				i++;
				k++;
			}
			while(j<right){
				arr[k]=temp[j];
				j++;
				k++;
			}
		}
				
	}

}
