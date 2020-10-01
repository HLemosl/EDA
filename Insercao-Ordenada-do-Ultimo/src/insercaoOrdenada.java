import java.util.Arrays;
import java.util.Scanner;

class insercaoOrdenada {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] inputArray = s.nextLine().split(" ");
		s.close();
		System.out.println(sortTheLast(inputArray));
	}

	public static String sortTheLast(String[] array) {
		int last = array.length - 1;
		while (last > 0 && Integer.parseInt(array[last]) < Integer.parseInt(array[last - 1])) {
			swap(array, last, last - 1);
			last--;
		}
		return Arrays.toString(array);
	}
	
	private static void swap(String[] a, int i, int j) {
		String temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
