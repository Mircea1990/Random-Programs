
public class BinarySearch extends selectionSort {

	public static int binaryRecursiv(int[] arr, int first, int last, int key) {
		if (last >= first) {
			int mid = first + (last - first) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] > key) {
				return binaryRecursiv(arr, first, mid - 1, key);
			} else {
				return binaryRecursiv(arr, first, mid + 1, key);
			}

		}

		return -1;

	}

	public static void main(String[] args) {
		int arr[] = { 50, 100, 5, 6, 48, 15, 48, 46, 55, 36 };
		int[] number = selectiSort(arr);
		System.out.println("Elementele sortate crescator: ");
		for (int i = 0; i < number.length; i++) {
			System.out.print(" " + number[i]);
		}
		System.out.println();

		int key = 46;
		int last = arr.length - 1;
		int result = binaryRecursiv(arr, 0, last, key);
		if (result == 0) {
			System.out.println("Elemenul nu exista");
		} else {
			System.out.println("Elementul " + arr[result] + " se gaseste la indexul " + result);
		}
	}

}
