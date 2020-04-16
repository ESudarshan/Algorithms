
public class SelectionSort {

	public static void main(String[] args) {

		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}
		System.out.println("Selection Sort");
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			int temp = array[i];
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			array[i] = array[minIndex];
			array[minIndex] = temp;
			System.out.println("\nPass : " + (i + 1));
			for (int a : array) {
				System.out.print(a + " ");
			}

		}

		System.out.println("\n\nSorted :");
		for (int a : array) {
			System.out.print(a + " ");
		}

	}

}
