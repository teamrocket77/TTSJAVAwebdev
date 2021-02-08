package javaTest;
import java.util.Scanner;
public class javaTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter your First name");
		String fname = in.next();
		System.out.println("Please Enter your Last Name");
		String lname = in.next();
		System.out.printf("Hello %s %s\n", fname, lname);
		System.out.println("Please enter a number greater than 0 and less than 100");
		int num = in.nextInt();
		int tries = 0;
		while (true) {
				tries +=1;
			if (num>=0&&num<=100) break;
			System.out.println("Please enter a number greater than 0 and less than 100");
			}
		System.out.printf("All done it took you %d %s", tries, (tries==1) ? "try":"tries");
			
			
	}

}
