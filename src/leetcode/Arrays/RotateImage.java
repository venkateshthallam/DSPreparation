package src.leetcode.Arrays;

import java.util.concurrent.ThreadLocalRandom;

/*
1. Reverse the array first, swap 0th row with n-1th row(n is the length)
2. Then change the symmetry -> like swap 0,1 with 1,0 and 0,2 with 2,0 etc.
*/
public class RotateImage {
	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = ThreadLocalRandom.current().nextInt(1, 3+2);
			}
		}
		System.out.println("Before rotation");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		/*System.out.println("After clockwise rotation");
		rotateClockWise(arr);	
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}*/
		
		rotateAntiClockWise(arr);
		System.out.println("After anti clockwise rotation");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
    public static void rotateClockWise(int[][] matrix) {
        int s=0, e = matrix.length - 1;
        //Reverse the array
        while(s<e){
            int[] temp = matrix[s];
            matrix[s] = matrix[e];
            matrix[e] = temp;
            s++;e--;
        }
        //Change symmetry
        for(int i=0;i<matrix.length-1;i++)
            for(int j=i+1;j<matrix[i].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        
    }
    
    public static void rotateAntiClockWise(int[][] matrix){

        int s=0, e = matrix.length - 1, r=0;
        //Reverse the array
        for(int i=0;i<matrix.length-1;i++){
            for(int j=matrix[i].length-1;j>0;j--){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
    	}
	
        //After reversing the array left to right
        System.out.println("After reversing the array left to right");
        for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
					System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
       
        //Change symmetry
        for(int i=0;i<matrix.length-1;i++)
            for(int j=i+1;j<matrix[i].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
    }
}