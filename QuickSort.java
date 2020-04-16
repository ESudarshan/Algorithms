
public class QuickSort {
	public static void main(String[] args) {

		int[] array = { 0, 3, 3, 6, 0 };
		/*
		 * new int[5];
		 * 
		 * for (int i = 0; i < array.length; i++) { array[i] = (int) (Math.random() *
		 * 10); }
		 */

		System.out.println("Quick Sort");
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
			quickSort(array, index, end);
		}
	}

	private static int partition(int[] array, int start, int end) {
		int pivot = array[(start)];
		while (start <= end) {
			while (array[start] < pivot) {
				start++;
			}
			while (array[end] > pivot) {
				end--;
			}
			if (start <= end) {
				int temp = array[start];
				array[start] = array[end];
				array[end] = temp;
				start++;
				end--;
			}
		}
		return start;
	}

}
