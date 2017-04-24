package src.Random;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		//printPascalTriangle(1);
		System.out.println(generatePascalTriangle(2));
	}
		
	public static List<List<Integer>> generatePascalTriangle(int numRows) {
		
		List<List<Integer>> pascalNumbersList = new ArrayList<List<Integer>>();
		ArrayList<Integer> pre = new ArrayList<Integer>();
		if(numRows == 0){
			return pascalNumbersList;
		}
		pre.add(1);
		pascalNumbersList.add(pre);
		for(int i=2;i<=numRows;i++){
			ArrayList<Integer> current = new ArrayList<Integer>();
			current.add(1);
			for(int j=0;j<pre.size()-1;j++){
				current.add(pre.get(j) + pre.get(j+1));
			}
			current.add(1);
			pascalNumbersList.add(current);
			pre = current;
		}
		
		return pascalNumbersList;
	}

}
