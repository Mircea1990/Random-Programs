import java.util.Scanner;

public class PrimeNumber {

	public static boolean checkPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti un numar ");
		int num = scan.nextInt();

		if (checkPrime(num)) {
			System.out.println(num + " este numar prim");
		} else {
			System.out.println(num + " nu este numar prim");
		}
		scan.close();

	}

}
