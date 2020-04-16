
public class BubbleSort {

	public static void main(String[] args) {

		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}
		System.out.println("Bubble Sort");
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.println();
		boolean isSorted = false;

		int length = array.length - 1;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < length; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					isSorted = false;
				}
			}
			length--;
			System.out.println("\nPass :");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}

		}
		System.out.println("\n\nSorted :");
		for (int a : array) {
			System.out.print(a + " ");
		}

	}

}
