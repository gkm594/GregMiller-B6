package day8HW;

public class CozaLozaWozaFor {
	
public static void main(String[] args1) {
		
		for(int i = 1; i <= 36; i++) {
			
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
