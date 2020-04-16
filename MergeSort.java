
public class MergeSort {
	public static void main(String[] args) {

		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}

		System.out.println("Merge Sort");
		for (int a : array) {
			System.out.print(a + " ");
		}

		mergeSort(array, 0, array.length - 1, new int[array.length]);

		System.out.println("\n\nSorted :");
		for (int a : array) {
			System.out.print(a + " ");
		}

	}

	private static void mergeSort(int[] array, int start, int end, int[] temp) {
		if (start < end) {
			int mid = (start + end) / 2;

			mergeSort(array, start, mid, temp);
			mergeSort(array, mid + 1, end, temp);

			merge(array, start, end, temp);
		}
	}

	private static void merge(int[] array, int start, int end, int[] temp) {
		int mid = (start + end) / 2;
		int i = start;
		int j = mid + 1;
		int k = start;

		while (i <= mid && j <= end) {
			if (array[i] <= array[j]) {
				temp[k] = array[i];
				i++;
			} else {
				temp[k] = array[j];
				j++;
			}
			k++;
		}

		while (i <= mid) {
			temp[k] = array[i];
			i++;
			k++;
		}

		while (j <= end) {
			temp[k] = array[j];
			j++;
			k++;
		}

		while (start <= end) {
			array[start] = temp[start];
			start++;
		}
	}

}
