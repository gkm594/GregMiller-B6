package day8HW;

public class Day8HW4DoWhile {
	
public static void main(String[] args) {
		
		int evenTotal = 0;
		
		int oddTotal = 0;
		
		int count = 1;
		
		do {	
			if (count % 2 == 0) {
				
				evenTotal = evenTotal + count;
				
			} else {
				
				oddTotal = oddTotal +  count;
			
			}
			count++;
			
			} while (count <= 20);
		
		
		System.out.println("Do While Even Total: " + evenTotal);
		System.out.println("Do While Odd Total: " + oddTotal);



	}

}


