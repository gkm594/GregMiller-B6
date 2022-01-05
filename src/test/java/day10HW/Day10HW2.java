package day10HW;

public class Day10HW2 {
	
	public static void main(String[] args) {
		
		getGender('m');
		
		
	}
	public static void getGender(char gender) {
		
		if(gender == 'f' || gender == 'F') {
			System.out.println("Female");
			
		} else if (gender == 'm' || gender == 'M') {
			System.out.println("Male");
			
		} else {
			System.out.println("Wrong gender option");
		
		}
}
}
