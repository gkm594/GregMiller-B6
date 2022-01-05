package day10HW;

public class Day10HW3 {
	
	public static void main(String[] args) {
		
		oddEven(3);
		
	}
	public static void oddEven(int number) {
		if(number %2 == 1) {
			System.out.println("The number is an odd number");
			
		} else if(number %2 == 0) {
			System.out.println("The number is an even number");
		}
		
}
}
