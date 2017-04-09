package Arrays;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new CharCount().charCountSeq("aabbdddaacc"));

	}
	
	public String charCountSeq(String str){
		char temp=str.charAt(0);
		int count=1;
		StringBuilder newString=new StringBuilder();
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)==temp){
				count++;
			}
			else{
				System.out.println(temp+""+count);
				newString.append(temp+""+count);
				temp=str.charAt(i);
				count=1;
			}
			
		}
		newString.append(temp+""+count);
		return (str.length()>newString.length()?newString.toString():str);
		//return newString.toString();
	}

}
