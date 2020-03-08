package ArrayPrograms;

public class ElementFrequency {

	public static void main(String[] args) {

		// Initializare vector
		int[] arr = new int[] { 12, 2, -10, -10, -10, 6, 5, 45, 3, 45, 65, 7, 45, 12, 12, 8, 3, 2, 2, 2, 12, 1 };
		int[] fr = new int[arr.length];
		int visited = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					// pentru a evita numararea aceluiasi element
					fr[j] = visited;
				}
			}
			if (fr[i] != visited)
				fr[i] = count;
		}

		// Afisam elementele din vector si frecventa lor
		System.out.println("---------------------------------------");
		System.out.println(" Element | Frequency");
		System.out.println("---------------------------------------");
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited)
				System.out.println("    " + arr[i] + "      |      " + fr[i]);
		}
		System.out.println("----------------------------------------");
	}

}
