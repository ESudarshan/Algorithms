
public class InsertionSort {

	public static void main(String[] args) {

		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}
		System.out.println("Insertion Sort");
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.println();

		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i - 1;
			while (j >= 0 && temp < array[j]) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = temp;
			System.out.println("\nPass " + i);
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
