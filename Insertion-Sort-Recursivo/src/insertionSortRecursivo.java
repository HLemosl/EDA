import java.util.Arrays;
import java.util.Scanner;

class insertionSortRecursivo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] inputArray = s.nextLine().split(" ");
		s.close();
		int[] intArray = changeArray(inputArray);
		recursiveInsertionSort(intArray, 0, intArray.length - 1);
	}
	
	private static int[] changeArray(String[] arrayToChange) {
		int[] newArray = new int[arrayToChange.length];
		for (int i = 0; i < arrayToChange.length; i++) {
			newArray[i] = Integer.parseInt(arrayToChange[i]);
		}
		return newArray;
	}
	
	public static void recursiveInsertionSort(int[] array, int firstIndex, int lastIndex) {
		if (firstIndex == lastIndex || array.length == 0) {
			return;
		}
		
		int index = firstIndex+1;
		while (index > 0 && array[index] < array[index-1]) {
			swap(array, index, index-1);
			index--;
		}
		System.out.println(Arrays.toString(array));
		recursiveInsertionSort(array, firstIndex+1, lastIndex);
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
