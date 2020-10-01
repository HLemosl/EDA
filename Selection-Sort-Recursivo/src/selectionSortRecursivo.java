import java.util.Arrays;
import java.util.Scanner;

class selectionSortRecursivo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] inputArray = s.nextLine().split(" ");
		s.close();
		int[] intArray = changeArray(inputArray);
		recursiveSelectionSort(intArray, 0, intArray.length - 1);
	}
	
	private static int[] changeArray(String[] arrayToChange) {
		int[] newArray = new int[arrayToChange.length];
		for (int i = 0; i < arrayToChange.length; i++) {
			newArray[i] = Integer.parseInt(arrayToChange[i]);
		}
		return newArray;
	}
	
	public static void recursiveSelectionSort(int[] array, int firstIndex, int lastIndex) {
		if (firstIndex == lastIndex || array.length == 0) {
			return;
		}
		
		int lowestIndex = firstIndex;
		for (int j = firstIndex + 1; j <= lastIndex; j++) {
			if (array[j] < array[lowestIndex]) {
				lowestIndex = j;
			}
		}
		
		if (lowestIndex != firstIndex) {
			swap(array, firstIndex, lowestIndex);
		}
		
		System.out.println(Arrays.toString(array));
		recursiveSelectionSort(array, firstIndex+1, lastIndex);
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}