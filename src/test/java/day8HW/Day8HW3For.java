package day8HW;

public class Day8HW3For {

public static void main(String[] args) {
		
		int sum = 0;
		 	
		for (int i = 20; i <= 30; i++) {
			//System.out.println(i); //prints 20 through 30, not needed for average 
			
			sum = sum + i; // sum = 0 (the initial sum) + 20
			// 2nd cycle: 20 + 21 = 41, 3rd cycle: 41+22=63, and so on
		}
			//System.out.println(sum); //prints out the sum of 20 through 30
			
			System.out.println("Average: " + sum/11);			
					
	}	
}
