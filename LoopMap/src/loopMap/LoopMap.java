package loopMap;
import java.util.HashMap;
import java.util.Scanner;
public class LoopMap {
	static int product(int arr[]) {
		int productNum = arr[0];
		for (int i = 1; i<arr.length;i++) {
			productNum *= arr[i];
		}
		return productNum;
	}
	static int sum(int arr[]) {
		int carrier = 0;
		for (int i : arr) {
			carrier += i;
		}
		return carrier;
	}
	static int Max(int arr[]) {
		int carrier = Integer.MIN_VALUE;
		for ( int i : arr) {
			if (carrier <i) {
				carrier = i;
			}
		} return carrier;
	}
	static int min(int arr[]) {
		int carrier = Integer.MAX_VALUE;
		for (int i: arr) {
			if (carrier>i) {
				carrier = i;
			}
		} return carrier;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter 5 numbers");
		int[] arr = new int[5];
		for (int i =0;i<5;i++) {
			arr[i] = in.nextInt();
		}
		System.out.printf("The Sum is: %d\n", sum(arr));
		System.out.printf("The Max is: %d\n", Max(arr));
		System.out.printf("The Min is: %d\n", min(arr));
		System.out.printf("The Product is: %d\n", product(arr));
		
		
		
		HashMap<String, String> Dealer = new HashMap<String, String>();
		Dealer.put("Accord", "Honda");
		Dealer.put("Civic", "Honda");
		Dealer.put("Impala", "Chevy");
		Dealer.put("ZO6", "Chevy");
		Dealer.put("Mustang", "Ford");
		System.out.println("What type of car are you looking for?");
		System.out.println("Please enter the model first and then the make.");
		System.out.println("Enter information seperated by a space");
		System.out.println("If you want to Exit the program at any time enter 0 0");
		for (int i = 0;i<5;i++) {
			String[] car = in.nextLine().split(" ");
			if(car[0].equals("0")) break;
			
			if (Dealer.containsKey(car[0])) {
				System.out.printf("Oh you're looking for a %s?\n", car[0]);
				System.out.printf("Our %s selection is right over here\n", car[1]);
				if (Dealer.get(car[0]).equals(car[1])) {
					System.out.println("Please pay");
				} else System.out.println("Please Try again we don't seem to have that Model");
			} else System.out.println("We don't seem to have that Make");

		} System.out.println("Exiting now");
		System.out.println("Bye.");
	}

}
