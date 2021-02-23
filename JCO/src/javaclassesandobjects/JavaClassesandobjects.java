package javaclassesandobjects;

public class JavaClassesandobjects {

	public static void main(String[] args) {
		Pet Eli = new Pet("Eli", "Pig", 1);
		Eli.setLocation("Georgia");
		System.out.println(Eli.getName());
		
		car Accord = new car();
		car Mustang = new car("Ford", "Mustang", "Coupe");
		Mustang.start();
		System.out.println(Accord.isrunning());
		System.out.println(Mustang.isrunning());
	}

}
