public class PrintNameForNTimes{


	public static void main(String[] args){
		printName("Ahmad Sayeed", 1, 5);
	}

	private static void printName(String name, int count, int tillNum){
		if(count > tillNum)
			return;
			
		System.out.println(name);
		printName(name, ++count, tillNum);
	}

}