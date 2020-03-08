import java.util.Scanner;

public class Palindrom {
	public static boolean checkPalindrom() {
		
		String invers = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduceti un numar sau un cuvant");
		String imputTastatura = scanner.nextLine();
		int lungime = imputTastatura.length();
		scanner.close();

		for (int i = lungime - 1; i >= 0; i--)
			invers = invers + imputTastatura.charAt(i);
		if (imputTastatura.equals(invers)) {
			System.out.println("Este palindrom");
			return true;
		} else {
			System.out.println("Nu este palindrom");
			return false;
		}

	}

	public static void main(String[] args) {
		checkPalindrom();
	}

}
