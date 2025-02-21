package seleniumP;

public class JavaExcerciseArray {

	public static void main(String[] args) {
		int [] num = {1, 2, 3, 4, 50};
		System.out.println("First element: " + num[0]);
		System.out.println("Last element: " + num[num.length-1]);
		System.out.println("Length of the array is "+ num.length);
		
		for (int i = num.length-1; i>=0; i--) {
			System.out.println(num[i]);
		}


	}

}
