public class PrintNumbers{
	
	public static void main(String[] args){
		System.out.println("Print 0 to 9 without using for loop");
		print(0);
	}
	
	private static void print(int num){
		if(num > 9) // called base condition
			return;
		
		System.out.println(num);
		print(++num);
	}
	
}