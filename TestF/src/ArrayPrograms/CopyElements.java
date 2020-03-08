package ArrayPrograms;

public class CopyElements {

	public static void main(String[] args) {

		int[] vector1 = { 10, 20, 30, 40, 50, 60 };
		int[] vector2 = new int[vector1.length];

		System.out.println("Elementele vectorului 1: ");
		for (int i = 0; i < vector1.length; i++) {
			vector2[i] = vector1[i];
			System.out.print(vector1[i] + " ");
		}
		System.out.println();
		System.out.println("Elementele vectorului 2: ");
		for (int i = 0; i < vector2.length; i++) {
			System.out.print(vector2[i] + " ");
		}
		System.out.println();

	}
}