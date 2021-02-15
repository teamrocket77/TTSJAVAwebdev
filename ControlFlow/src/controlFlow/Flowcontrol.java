package controlFlow;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;


public class Flowcontrol {

	public static void main(String[] args) {
		String name, response, redCar, petName, actorName;
		String cont = "yes";
		int petAge, luckyNum, modelYear, 
		jerseyNum, _counter, index , chances, magicBall;
		int[] intarr = new int[3];
		int[] carInt = new int[4];
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your Name");
		name = scanner.nextLine();

		System.out.printf("Hello %s\n", name);
		System.out.println("Would you like to continue to the interactive portion");
		response = scanner.next().toLowerCase();
		if(! (response.equals("yes") | response.equals("y"))) {
			System.out.println("Ending now");
			scanner.close();
			return;
		}
		while (cont.equals("yes")){
			System.out.println("Do you have a red car? (yes, no): ");
			redCar = scanner.next().toLowerCase();
			System.out.println("What's the name of your favorite pet?");
			petName = scanner.next();
			System.out.println("What's the age of your favorite pet? ");	
			petAge = scanner.nextInt();
			System.out.println("What's  your lucky number");
			luckyNum = scanner.nextInt();
			System.out.println("Do you have a Favorite Quater Back? If so What's ther Jersey Number?");
			jerseyNum = scanner.nextInt();
			System.out.println("What's the two digit model year of your car");
			modelYear = scanner.nextInt();
			System.out.println("What's the name of your favorite actress?");
			actorName = scanner.next();

			for (_counter =0;_counter<3;_counter++) {
				intarr[_counter] = ThreadLocalRandom.current().nextInt(1, 65);	
			}
			chances = ThreadLocalRandom.current().nextInt(1,10);
			index = ThreadLocalRandom.current().nextInt(1,3);
			if(chances>5) magicBall = jerseyNum*intarr[index];
			else magicBall = luckyNum*intarr[index];
			carInt[0] = AsciiChars.returnNumber(petName, 2);
			carInt[1] = modelYear + luckyNum;
			carInt[2] = AsciiChars.returnNumber(actorName, 0);
			carInt[3] = jerseyNum+petAge+luckyNum;
			MSort m = new MSort();
			carInt = m.sort(carInt, 0, carInt.length-1);
			System.out.printf("Lottery numbers: %d, %d, %d, %d, Magic Ball: %d\n",
					carInt[0], carInt[1], carInt[2], carInt[3], magicBall);
			System.out.println("Do you want to play again? (yes or no)");
			cont = scanner.next();
		}
		scanner.close();
	}

}
