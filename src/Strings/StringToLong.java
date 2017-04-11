package src.Strings;



public class StringToLong {

	public static void main(String[] args) {
		long l = stringToLong("9223372036854775807ddl");
		if (l == 9223372036854775807L) {
			System.out.println("Successfully converted to a long");
		} else {
			System.out.println("Could not convert to a long");
		}
	}

	private static long stringToLong(String string) {
		int length = string.length();
		boolean neg = string.startsWith("-");
		boolean endsWithL = Character.toLowerCase(string.charAt(length - 1)) == 'l';
		
		int start = neg ? 1 : 0;
		int end = endsWithL ? length - 1 : length;
		
		long result = 0;
		
		for (int i = start; i < end; i++) {
			char c = string.charAt(i);
			if(c>=48 && c<=57){
			result = result * 10 + Character.digit(c, 10);
			}
			else{
				System.out.println("Not a digit, can not conver to long");
				return -1;
			}
			}
		
		return neg ? -result : result;
	}

}
