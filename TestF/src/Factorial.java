import java.util.Scanner;

public class Factorial {

	public static void factorial() {

		while (true) {

			Scanner scan = new Scanner(System.in);
			System.out.print("Introduceti un numar\n");

			int number = scan.nextInt();

			if (number <= 0)

				System.out.print("Numarul nu se poate calcula");
			else
				System.out.println("Factorialul este:");
			int fac = 1;
			for (int i = 1; i <= number; i++) {
				fac = fac * i;

			}
			System.out.println(fac);

		}
	}

	public static void main(String[] args) {
		factorial();

	}

}