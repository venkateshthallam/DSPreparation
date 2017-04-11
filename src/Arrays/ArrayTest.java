package src.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int[] intarray;
		intarray=new int[10];
		for(int i=0;i<intarray.length;i++){
			intarray[i]=i;
		}
		System.out.println(intarray.length);
		for(int i=0;i<intarray.length;i++){
			System.out.println(intarray[i]);
		}

	}

}
