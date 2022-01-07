package day11HW;

public class SleepStatus {
	
	public static void main(String[] args) {
		
		boolean amISleeping = sleepIn(false, false);
		
		boolean amISleeping2= sleepIn(true, false);
		
		boolean amISleeping3= sleepIn(true, true);
		
		System.out.println(amISleeping);
		System.out.println(amISleeping2);
		System.out.println(amISleeping3);
			
	}
	
	public static boolean sleepIn(boolean isWeekday, boolean isVacation) {
		
		boolean result = false;
		
		if(isWeekday == true && isVacation == true) {
			result = false;
		} else {
			result = true;
		}
	
	return result;
	}
	
}
