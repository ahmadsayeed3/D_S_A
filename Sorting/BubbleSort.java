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

// If the given array has to be sorted in ascending order, then bubble sort will start by comparing the first element of the array with the second element, if the first element // is greater than the second element, it will swap both the elements, and then move to compare the second element to the third element, and so on.

// If we have total n elements, then we need to repeat this process for n-1 times.

// In the inner loop we always start from 0 index and run till last sorted index.
// Sorted Index means when you push the largest elmenet to the last, then second last and so on then once you pushed the largest element to last you don't
// need to touch them.


