package src.leetcode.Arrays;

public class SearchMatrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		int target = 5;
		System.out.println(searchMatrix(matrix, target));

	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0) return false;
        int rlength = matrix.length, clength = matrix[0].length;
        int ri = 0, ci = matrix[0].length-1;
        while(ri < rlength && ci > 0){
            if(matrix[ri][ci]==target) return true;
            else if(target < matrix[ri][ci]) ci--;
            else ri++;
        }
        
        return false;
    
    }

}
