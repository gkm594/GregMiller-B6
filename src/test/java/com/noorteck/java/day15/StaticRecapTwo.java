package com.noorteck.java.day15;

public class StaticRecapTwo {
	
	// static method
		public static void getInfo() {

			//TODO call [isJavaFun] variable and assign value = true
			boolean isJavaFun = true;
			//TODO call [totalAmount] variable and assign value = 1111
			int totalAmount = 1111;
			//TODO print value of variable [isJavaFun]
			System.out.println(isJavaFun);
			//TODO print value of variable [totalAmount]
			System.out.println(totalAmount);
			//TODO call method [addNum()]
			
	 

		}

		// non-static method
		public void statusUpdate() {

			//TODO call [month] variable and assign value = "January"
			String month = "January";
			//TODO call [iLikeJava] variable and assign value = "Java is life"
			String iLikeJava = "Java is life";
			//TODO print value of variable [month]
			System.out.println(month);
			//TODO print value of variable [iLikeJava]
			System.out.println(iLikeJava);
			//TODO call method [getCountry()]
			StaticRecapOne obj = new StaticRecapOne();
			obj.getCountry();


		}

		public static void main(String[] args) {
			 

			//TODO call method [getInfo()]
		}
	

}
