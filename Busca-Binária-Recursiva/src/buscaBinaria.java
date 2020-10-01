import java.util.Scanner;

class buscaBinaria {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] nums = s.nextLine().split(" ");
		int n = s.nextInt();
		s.close();
		System.out.println(binarySearch(nums, n, 0, nums.length - 1));
	}

	private static int binarySearch(String[] nums, int n, int start, int end) {
		if (start <= end) { //theta 1
			int half = (start + end) / 2; //theta 1
			if (Integer.parseInt(nums[half]) == n) { //theta 1
				return half;
			}
			System.out.println(half);
			if (n < Integer.parseInt(nums[half])) { //theta 1
				return binarySearch(nums, n, start, half - 1); //T(n/2)
			} else {
				return binarySearch(nums, n, half + 1, end);
			}
		}
		return -1; //theta 1
	}
}
