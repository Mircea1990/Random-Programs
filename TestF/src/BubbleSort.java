import java.util.Arrays;

public class BubbleSort {

	public static int[] bubbleSort(int[] lista) {

		for (int i = 0; i < lista.length - 1; i++) {
			int flag = 0;
			for (int j = 0; j < lista.length - 1 - i; j++) {

				if (lista[j] > lista[j + 1]) {

					int inverseaza = lista[j];

					lista[j] = lista[j + 1];

					lista[j + 1] = inverseaza;
				}
			}
			if (flag == 0)
				break;
		}
		return lista;
	}

	public static void main(String[] args) {
		int[] list = { 10, 50, 45, 100, 29, 56, 84 };
		bubbleSort(list);
		System.out.println("Lista sortata este: \n");
		for (int i = 0; i < list.length; i++) {

		}
		System.out.print(Arrays.toString(list));
	}

}
