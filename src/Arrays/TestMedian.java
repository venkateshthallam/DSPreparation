package Arrays;

public class TestMedian {

    public static void main(String[] args){ 
    	int[] a={10,0,8,2,-1,12,11,3};
        int median; 

        median = new TestMedian().findMedian(a,0,a.length-1); 
        System.out.println("median is = "+median);
        if(a.length%2 != 0) 
            System.out.print("the median is : "+a[median]); 
        else 
            System.out.print("the median is : "+(a[median] + a[median + 1])/2 ); 
    } 
    public int findMedian(int[] a,int left,int right){ 
        int index = 0; 
        int mid = (left+right)/2; 
        index = partition(a,left,right); 
        while( index != mid){ 
            if(index < mid) 
                index = partition(a,mid,right); 
            else index = partition(a,left,mid); 
        } 
        return index; 
    } 
    public int partition(int[] a,int i,int j ){ 
        int pivot = (i+j)/2; 
        int temp; 
        while(i <= j){ 
            while(a[i] < a[pivot]) 
                i++; 
            while(a[j] > a[pivot]) 
                j--; 
            if(i <= j){ 
                temp = a[i]; 
                a[i]=a[j]; 
                a[j] = temp; 
                i++;j--; 
            } 
        } 
        return pivot; 
    } 

}
