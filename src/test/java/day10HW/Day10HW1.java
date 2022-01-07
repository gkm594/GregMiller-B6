package day10HW;

public class Day10HW1 { //please tell me in your comment how to include numOne and numTwo in the console output
	
	public static void main(String[] args) {
		
		calculate(2.0, 4.0, '+');
/**
 * 
 * Hello.	
 */
	
	}
	public static void calculate(double numOne, double numTwo, char mathOperationSign) {
		
		if(mathOperationSign == '+') {
		System.out.println(numOne + numTwo);
		
		} else if(mathOperationSign == '-') {
		System.out.println(numOne - numTwo);
		
		} else if(mathOperationSign == '*') {
		System.out.println(numOne * numTwo);
		
		} else if(mathOperationSign == '/') {
		System.out.println(numOne / numTwo);
		
		} else if(mathOperationSign == '%') {
		System.out.println(numOne % numTwo);
		
		} else {
		System.out.println("Invalid sign");
		
		}
		
		
	}
}
