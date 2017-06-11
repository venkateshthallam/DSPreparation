package src.leetcode.String;

public class DetectCapitalUse {
	public boolean detectCapitalUse(String word) {
        if(word.length()==1) return true;
        char[] carr = word.toCharArray();
        int capCount = 0, spaceCount = 0;
        boolean isFirstCharBool = carr[0]>=65&&carr[0]<97?true:false;
        for(int i=1;i<carr.length;i++){
            if(carr[i]>=65 && carr[i]<97)
                capCount++;
        }
        System.out.println("capCount is "+capCount);
        //return ((capCount==0 || capCount == word.length()-1) || (capCount==0 && isFirstCharBool));
        return ((capCount==0 && isFirstCharBool) || (capCount > 1 && capCount==word.length()-1));
    }
    
    public static void main(String[] args) {
    	System.out.println(new DetectCapitalUse().detectCapitalUse("mL"));

	}

}