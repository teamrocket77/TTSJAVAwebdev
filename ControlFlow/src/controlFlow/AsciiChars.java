package controlFlow;

public class AsciiChars {
	public static void printNumbers(String s)
	{
		int value;
		char [] string = s.toCharArray();
		for (char letter: string ) {
			value = (int)letter;
			System.out.println(value);
		}
	}
	
	public static int returnNumber(String s, int position) {
		int value;
		char c = s.charAt(position);
		value = (int)c;
		return value;
		}

	public static void printLowerCase(String s)
	{
		int value;
		char [] string = s.toCharArray();
		for (char letter: string ) {
			value = (int)letter;
			if(value>=97 && value<=122);
		}
	}

	public static void printUpperCase(String s)
	{
		int value;
		char [] string = s.toCharArray();
		for (char letter: string ) {
			value = (int)letter;
			if(value>=65 && value<=90);
		}
	}
}
