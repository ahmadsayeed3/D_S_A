import java.util.Arrays;

public class BubbleSort{
	
	public static void main(String args[]){
		int[] intArray = {3,7,4,1,8,2,9,0};
		System.out.println("Input: " + Arrays.toString(intArray));
		
		int[] sortedArray = sort(intArray);
		System.out.println("Output: " + Arrays.toString(sortedArray));
	}
	
	private static int[] sort(int[] intArray){
		
		for(int i=0; i < intArray.length-1; i++){
			boolean anySwap = false;
			for(int j=0; j < (intArray.length-1) -i; j++){
				if(intArray[j] > intArray[j+1]){
					int temp = intArray[j];
					intArray[j] = intArray[j+1];
					intArray[j+1] = temp;
					anySwap = true;
				}
			}
			if(!anySwap)
				break;
		}
		
		return intArray;
	}
	
}