import java.util.Arrays;

public class ReverseArray{
	
	public static void main(String[] args){
		System.out.println("Way 1");
		int[] array = {5,4,3,2,1};
		System.out.println("Before: " + Arrays.toString(array));
		reverse(array, 0, array.length-1);
		System.out.println("After: " + Arrays.toString(array));
		
		System.out.println("Way 2");
		array = new int[]{6,7,8,9,10};
		System.out.println("Before: " + Arrays.toString(array));
		reverse2(array, 0);
		System.out.println("After: " + Arrays.toString(array));
		
		
	}
	
	// Way 1
	private static void reverse(int[] array, int left, int right){
		if(left >= right)
			return;
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
		reverse(array, left+1, right-1);
	}
	
	// Way 2, with one less parameter
	private static void reverse2(int[] array, int left){
		
		if(left >= array.length/2)
			return;
		
		int right = ((array.length-left)-1);
		
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
		
		reverse2(array, left+1);
	}
	
}