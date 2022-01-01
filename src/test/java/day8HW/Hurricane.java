package day8HW;

public class Hurricane {

public static void main(String[] args) {
		
		int i = 20;
		
		while(i <= 200) {
			
			if(i >=74 && i <=95) {
				System.out.println("Category 1 Hurricane: " + i);
				i++;
				 
			} else if(i >= 105 && i <= 110) {
				System.out.println("Category 2 Hurricane: " + i);
				i++;
				
			} else if(i >= 120 && i <= 130) {
				System.out.println("Category 3 Hurricane: " + i);
				i++;
				
			} else if(i >= 140 && i <= 155) {
				System.out.println("Category 4 Hurricane: " + i);
				i++;
				
			} else if(i >= 165 && i <= 194) {
				System.out.println("Category 5 Hurricane: " + i);
				i++;
				
			} else {
				System.out.println("Not a hurricane: " + i);
				i++;
			}
		}
}
}
