package classesOBJS;

public class Calculator {
	public static int add(int num1 , int num2) {
		return num1+num2;
	}
	public static int subtract(int num1 , int num2) {
		return num1-num2;
	}
	public static int multiply(int num1 , int num2) {
		return num1*num2;
	}
	public static double divide(int num1 , int num2) {
		return num1/num2;
	}
	public static int power(int num1 , int num2) {
		
		return (int) Math.pow(num1, num2);
	}
}
