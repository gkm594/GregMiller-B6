package day11HW;

public class Subtraction {

	public static void main(String[] args) {

		int diffTotal = difference21(15);

		System.out.println(diffTotal);

		int diffTotal2 = difference21(30);

		System.out.println(diffTotal2);

	}

	public static int difference21(int number) {

		int result = 0;

		if (number > 21) {
			result = (number - 21) * 2;

		} else {
			result = number - 21;
		}

		return result;
	}

}
