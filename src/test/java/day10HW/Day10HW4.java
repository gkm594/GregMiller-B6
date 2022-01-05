package day10HW;

public class Day10HW4 {

	public static void main(String[] args) {
		
		getDoWhileLoopResult(1, 1000);
	}

	public static void getDoWhileLoopResult(int minNum, int maxNum) {
		
		
		do {
			System.out.println(minNum);
			minNum++;	
		} while(minNum <= maxNum);
		
		}
}

