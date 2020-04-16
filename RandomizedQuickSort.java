import java.util.ArrayList;

public class RandomizedQuickSort {
	public static void main(String[] args) {

		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}

		System.out.println("Randomized Quick Sort");
		for (int a : array) {
			System.out.print(a + " ");
		}

		quickSort(array, 0, array.length - 1);

		System.out.println("\n\nSorted :");
		for (int a : array) {
			System.out.print(a + " ");
		}

	}

	private static void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int index = partition(array, start, end);
			quickSort(array, start, index - 1);
			quickSort(array, index + 1, end);
		}
	}

	private static int partition(int[] array, int start, int end) {
		int randomIndex = ((int) (Math.random() * 10) % (end - start + 1));
		int random = array[randomIndex];
		array[randomIndex] = array[end];
		array[end] = random;

		int pivot = array[end];
		int j = -1;
		for (int i = 0; i < end; i++) {
			if (array[i] <= pivot) {
				j++;
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		}
		array[end] = array[j + 1];
		array[j + 1] = pivot;
		return j + 1;
	}

}
