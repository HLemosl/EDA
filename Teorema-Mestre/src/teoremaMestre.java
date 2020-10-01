import java.util.Scanner;

class teoremaMestre {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] inputs = s.nextLine().split(" ");
		s.close();
		System.out.println(theoremMestre(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2])));
	}

	private static String theoremMestre(int a, int b, int ord) {
		double calculus = Math.log(a) / Math.log(b);
		String textReturn = "T(n) = theta(n**";
		if (ord < calculus) {
			return textReturn + (int) calculus + ")";
		} else if (ord == calculus) {
			return textReturn + (int) calculus + " * log n)";
		}
		return textReturn + ord + ")";
	}

}
