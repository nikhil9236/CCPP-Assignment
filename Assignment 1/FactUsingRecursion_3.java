import java.util.Scanner;

class FactUsingRecursion_3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		int fact = factorial(num);
		System.out.println(fact);

	}

	public static int factorial(int n) {

		if (n == 1)
			return 1;

		return n * factorial(n - 1);
	}
}