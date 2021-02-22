package javastructures;

public class JavaDataStucts2 {
	
	public static int[] toPower(int size, int Power) {
		
		int[] arr = new int[size];
		for (int i = 0;i<arr.length;i++) {
			arr[i] = (int)Math.pow(i, Power);
		}
		return arr;
	}
	public static void main(String[] args) {
		double [] exampleArray  = {1, 5, 6, 5, 4, 1};
		double max = Double.MIN_VALUE;
		int index = 0;
		for (int i = 0;i<exampleArray.length;i++) {
			if (exampleArray[i]>max) {
				max = exampleArray[i];
				index  = i;
			}
		}
		//output will be the index of the highest value
		// in this case it should be 2
		System.out.println(index);
		
		for (int i : toPower(2, 2)) {
			System.out.printf("%d ", i);
		}
		System.out.println(" ");
		
		for (int i : toPower(5, 5)) {
			System.out.printf("%d ", i);
		}
		System.out.println(" ");
		
		
	}

}
