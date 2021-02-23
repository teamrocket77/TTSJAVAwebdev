package classesOBJS;

public class JavaClasesObjets2 {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(2, 3));
		System.out.println(calc.subtract(2, 3));
		System.out.println(calc.multiply(2, 3));
		System.out.println(calc.divide(2, 3));
		System.out.println(calc.power(2, 3));
		MagicCalculator MC = new MagicCalculator();
		System.out.println("Sine");
		System.out.println(MC.sqrt(4));
		System.out.println(MC.sin(Math.PI/2));// should be 1
		System.out.println(MC.cosin(0)); // should also be 1
		System.out.println(MC.tan(Math.PI/4)); // just be 1
		System.out.println(MC.factorial(5));
		
	}

}
