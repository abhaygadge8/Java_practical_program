
/*5. Accept the alphabet from user and generate the multiplication table for number
corresponding to alphabet. If following the mapping for alphabets:
A→1, B→2, C→3……Z→26.*/
import java.util.Scanner;

class Alphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter Capital alphabet :");
		String alpha = sc.nextLine();
		for (int i = 0; i < alpha.length(); i++) {
			char ch = alpha.charAt(i);
			int value = (int) ch;
			int n = value - 64;
			for (int j = 1; j <= 10; j++) {
				n = n * j;
				System.out.println(n);
			}
		}

	}
}