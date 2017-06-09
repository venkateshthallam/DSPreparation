package src.leetcode.Arrays;

public class SearchMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		System.out.println(searchMatrix(matrix, 34));
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int start = 0, end = rows;
        int mid = 0;
        while(start < end){
            mid = (start + end)/2;
            int col = matrix[mid].length-1;
            if(matrix[mid][0]==target || matrix[mid][col]==target ) return true;
            if(matrix[mid][0] <= target && matrix[mid][col] >=target) break;
            else if(matrix[mid][0] > target){ end = mid; }
            else start = mid+1;
        }
        System.out.println("mid is "+mid);
        int cols = 0, cole = matrix[mid].length, colm =0;
        while(cols < cole){
        	colm = (cols + cole)/2;
        	if(matrix[mid][colm]==target){ 
        		System.out.println("target is "+matrix[mid][colm]);
        		return true;
        	}
        	else if(matrix[mid][colm] > target) cole = colm;
        	else cols = colm+1;
        }
        
        
        return false;
    }

}
