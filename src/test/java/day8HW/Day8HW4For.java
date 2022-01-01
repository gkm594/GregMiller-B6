package day8HW;

public class Day8HW4For {
	
public static void main(String[] args) {
		
		int evenTotal = 0; // creating memory space so odd/even values can be stored as int's
		
		int oddTotal = 0;
		
		for (int i = 1; i <=20; i++) {
			
			if (i % 2 == 0) { // even --> 1 mod 2, remainder is not 0, so it goes to odd. 2 mod 2's remainder IS 0, so it goes to even
				
				evenTotal = evenTotal +i; // The i here is a one time even number that is added on to the even total
				
			} else { // odd
				
				oddTotal = oddTotal + i; // The i here is a one time odd number that is added on to the odd total
			}
		}
		
		System.out.println("Even Total: " + evenTotal);
		System.out.println("Odd Total: " + oddTotal);
	}

}
