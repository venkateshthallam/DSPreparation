package Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={1,2,3,5,7,0};
		int[] arr2={3,5,7,8,1,2};//3,5,7,8,1,2,3,5,7,8,1,2
		
		if(new ArrayRotation().isRotated(arr1,arr2))
			System.out.println("They are rotations of each other");
		else
			System.out.println("They are not rotations of each other");

	}
	
	public boolean isRotated(int[] arr1,int[] arr2){
		boolean match=false;
		if(arr1!=null && arr2!=null && arr1.length>0 && arr2.length>0){
				if(arr1.length==arr2.length)
				{
					for(int i=0;i<arr1.length;i++)
					{
						for(int j=0;i<arr2.length;j++)
						{
							if(j==arr2.length) j=0;
								if(!match)
								{
									if(arr1[i]==arr2[j]){
										match=true;
										i++;
									}
								}
								else
								{
									if(arr1[i]==arr2[j])
									{
										i++;
									}
									else{
										return false;
									}
								}
							}
						}
					
						
					}
					
					
				}
		return match;
	}
	

		
		
		
	

}
