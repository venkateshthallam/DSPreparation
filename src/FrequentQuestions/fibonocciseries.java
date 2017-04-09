package FrequentQuestions;

public class fibonocciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfFibonocci=10;
		new fibonocciseries().geenrateFibonocciIteratively(noOfFibonocci);
		
	}
	
	void geenrateFibonocciIteratively(int num){
		int x=0,y=1,i=2;
		int[] res=new int[num];
		res[0]=x;
		res[1]=y;
		int temp;
		System.out.print(x+","+y+",");
		while(i<num){
			temp=x+y;	
			System.out.print(temp+",");
			x=y;
			y=temp;
			i++;
		}
	}
	
	void genFibRecursively(int num){
		
	}

}
