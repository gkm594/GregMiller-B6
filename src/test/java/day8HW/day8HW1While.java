package day8HW;

public class day8HW1While {
	
public static void main(String[] args) {
		
		int i = 0; // I had to change this variable from 1 to 0 because the number 1 was not printing
		
		while (i <=35) { // I had to change this variable from 36 to 35 because the number 37 was printing
		i++;
		
		if(i % 3 == 0 && i % 5 == 0) {
			System.out.println("CozaLoza");
			
			} else if(i % 3 ==0) {
				System.out.println("Coza");
			
			} else if(i % 5 ==0) {
				System.out.println("Loza");
				
			} else if(i % 7 ==0) {
				System.out.println("Woza");

			} else {
				System.out.println(i);
		}
	}

}

}
