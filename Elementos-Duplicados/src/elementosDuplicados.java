import java.util.Scanner;

class elementosDuplicados {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] nums = s.nextLine().split(" ");
		s.close();
		System.out.println(existeDuplicados(nums));
	}

	private static boolean existeDuplicados(String[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (Integer.parseInt(nums[i]) == Integer.parseInt(nums[j])) {
                    return true;
                }
            }
        }
        return false;
	}
}

