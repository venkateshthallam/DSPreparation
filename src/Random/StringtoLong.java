package src.Random;

public class StringtoLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result=new StringtoLong().StringToLong("122444487847874");
		System.out.println("Result is "+result);

	}

	long StringToLong(String str)
	{
	/* code goes here to convert a string to a long */ 
			long result = 0;
			long factor = 1;
			for(int i=str.length()-1;i>-1;i--)
			{
				char c = str.charAt(i);
				long k = c-48;
				result = (factor*k)+result;
				factor = factor * 10;
			}
			
			System.out.println("Therefore the long number is : " + result);
	return result;
	}
}
