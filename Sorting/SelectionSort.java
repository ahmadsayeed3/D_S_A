import java.util.Arrays;

public class SelectionSort{

	public static void main(String[] args){
		int[] array = {9,7,3,1,5,4,0,3,2};
		System.out.println("Input: " + Arrays.toString(array));
		
		int[] sorted = sort(array);
		System.out.println("Output: " + Arrays.toString(array));
	}

	private static int[] sort(int[] array){
		
		for(int i=0; i < array.length-1; i++){
			int index = i;
			for(int j=i+1; j < array.length; j++){
				if(array[index] > array[j]){
					index = j;
				}
					
				int temp = array[i];
				array[i] = array[index];
				array[index] = temp;
			}
		}
		
		return array;
	}
}