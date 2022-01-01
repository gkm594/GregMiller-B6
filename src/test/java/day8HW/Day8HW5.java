package day8HW;

public class Day8HW5 {
	
public static void main(String[] args) {
		
		for(int i = 1; i<=32; i++) { 
			
			if(i >= 2 && i <=5 && i % 2 ==0) {
				System.out.println("Even number 2-5: " + i);
			
			} else if(i >= 6 && i <=20 && i % 2 ==0) {
				System.out.println("Even number 6-20: " + i);
				
			} else if(i >= 15 && i <=20 && i % 2 ==1) {
				System.out.println("Odd number 15-20: " + i);
				
				
			}
		}
	}

}
