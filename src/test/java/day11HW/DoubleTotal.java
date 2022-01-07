package day11HW;

public class DoubleTotal {

	public static void main(String[] args) {

		int myTotal = sumDouble(10, 10);
		System.out.println(myTotal);
	}

	public static int sumDouble(int valueOne, int valueTwo) {

		int result = valueOne + valueTwo;

		if (valueOne == valueTwo) {

			result = result * 2;
		}
		return result;
	}

}
