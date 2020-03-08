public class CopyAllElements extends selectionSort {
	public static void copyElem(int arr[]) {

	}

	public static void main(String[] args) {
		int[] arry1 = { 45, 84, -4, 5, 10, 80, 65 };
		int[] arry2 = new int[arry1.length];

		for (int i = 0; i < arry1.length; i++) {
			arry2[i] = arry1[i];
		}
		System.out.print("Primul vector: ");
		for (int i = 0; i < arry1.length; i++) {

			System.out.print(arry1[i] + " ");
		}
		System.out.println();

		System.out.print("Al doilea vector in ordine crescatoare: ");
		for (int i = 0; i < arry2.length; i++) {
			selectiSort(arry2);
			System.out.print(arry2[i] + " ");
		}
		System.out.println();

	}
}
