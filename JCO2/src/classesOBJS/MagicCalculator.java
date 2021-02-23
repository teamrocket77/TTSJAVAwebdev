package classesOBJS;

public class MagicCalculator extends Calculator {
	
	public static double sqrt(double num1) {
		return Math.sqrt(num1);
	}
	public static double sin(double num1) {
		return Math.sin(num1);
	}
	public static double cosin(double num1) {
		return Math.cos(num1);
	}
	public static double tan(double num1) {
		return Math.tan(num1);
	}
	public static int factorial(int num1) {
		int carrier = 1;
		for (int i = num1;i>0;i--) {
			carrier *=i;
		}
		return carrier;
	}
	

}
