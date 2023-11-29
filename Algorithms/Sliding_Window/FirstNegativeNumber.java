// First Negative Number in every Window of Size K | Sliding Window


import java.util.LinkedList;
import java.util.Queue;


public class FirstNegativeNumber{

	public static void main(String[] args){
		int[] array = {12, -1, 7, -3, 8 , 16, 2};
		int length = array.length;
		int k = 3;
		Queue<Integer> queue = new LinkedList<>();
		int i =0;
		int j=0;
		
		while(j < length){
			if(array[j] < 0)
				queue.add(array[j]);
				
			if(j-i+1 < k){
				j++;
			}else{
				if(!queue.isEmpty()){
					int num = queue.peek();
					System.out.println(num);
					if(num == array[i])
						queue.poll();
				}
				i++;
				j++;
				
			}
		}
	
	}

}