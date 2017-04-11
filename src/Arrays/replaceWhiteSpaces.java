package src.Arrays;

public class replaceWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new replaceWhiteSpaces().replaceSpaces("I am a boy"));
	}
	
	public String replaceSpaces(String str){
		char[] strc=str.toCharArray();
		
		for(int i=0;i<strc.length;i++){
			int length=str.length();
			if(strc[i]==' '){
				for(int j=length-1;j>i;j--){
					char tempc1=strc[j];
					strc[j]=strc[j-1];
					strc[j+1]=tempc1;
				}
			}
		
		}
		
		
		return null;//temp
	}

}
