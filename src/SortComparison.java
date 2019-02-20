import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;

public class SortComparison {

/*	public static void main(String args[]) {
		goThroughValues("C:\\Users\\mcnam\\Documents\\GitHub\\assignment\\src\\numbers10.txt", 10);
		goThroughValues("C:\\Users\\mcnam\\Documents\\GitHub\\assignment\\src\\numbers100.txt", 100);
		goThroughValues("C:\\Users\\mcnam\\Documents\\GitHub\\assignment\\src\\numbers1000.txt", 1000);
		goThroughValues("C:\\Users\\mcnam\\Documents\\GitHub\\assignment\\src\\numbers1000Duplicates.txt", 1000);
		goThroughValues("C:\\Users\\mcnam\\Documents\\GitHub\\assignment\\src\\numbersNearlyOrdered1000.txt", 1000);
		goThroughValues("C:\\Users\\mcnam\\Documents\\GitHub\\assignment\\src\\numbersReverse1000.txt", 1000);
		goThroughValues("C:\\Users\\mcnam\\Documents\\GitHub\\assignment\\src\\numbersSorted1000.txt", 1000);
	}


	 Answers: a. Insertion sort. This is due to the fact it has a worst case
	  complexity of O(n^2).

	  b. Insertion sort. As when the array is already sorted it has no need to go into the nested while function.

	  c. Quick sort is the worst and Merge sort recursive is the best in terms of scalability.

	  d. Yes however only when it got to large nearly sorted or already sorted data sets.

	  e. numbers10: insertionSort. numbers100: quickSort. numbers1000: mergeSortRecursive.
	     numbers1000Duplicates: quickSort. numbersNearlyOrdered1000: mergeSortRecursive.
	     numbersReverse1000: mergeSortRecursive. numbersSorted1000: insertionSort.

numbers10.txt
Time: .00327. Function: insertionSort.
Time: .00407. Function: selectionSort.
Time: .00527. Function: quickSort.
Time: .00777. Function: mergeSortRecursive.
Time: .03607. Function: mergeSortIterative.

numbers100.txt
Time: .10263. Function: insertionSort.
Time: .17607. Function: selectionSort.
Time: .05380. Function: quickSort.
Time: .06037. Function: mergeSortRecursive.
Time: .06250. Function: mergeSortIterative.

numbers1000.txt
Time: 5.63007. Function: insertionSort.
Time: 2.91903. Function: selectionSort.
Time: .22293. Function: quickSort.
Time: .17730. Function: mergeSortRecursive.
Time: .19740. Function: mergeSortIterative.

numbers1000Duplicates.txt
Time: 1.27903. Function: insertionSort.
Time: .65527. Function: selectionSort.
Time: .08757. Function: quickSort.
Time: .21640. Function: mergeSortRecursive.
Time: .23650. Function: mergeSortIterative.

numbersNearlyOrdered1000.txt
Time: .09577. Function: insertionSort.
Time: .60413. Function: selectionSort.
Time: .09867. Function: quickSort.
Time: .08493. Function: mergeSortRecursive.
Time: .20260. Function: mergeSortIterative.

numbersReverse1000.txt
Time: 1.08690. Function: insertionSort.
Time: 1.26377. Function: selectionSort.
Time: 1.05100. Function: quickSort.
Time: .06823. Function: mergeSortRecursive.
Time: .11487. Function: mergeSortIterative.

numbersSorted1000.txt
Time: .00370. Function: insertionSort.
Time: .68617. Function: selectionSort.
Time: 1.00333. Function: quickSort.
Time: .05437. Function: mergeSortRecursive.
Time: 1.51263. Function: mergeSortIterative.



	public static void goThroughValues(String input, int length) {
		double[] values = readInValues(input, length);
		double[] tmp = values.clone();

		double timeInsertion = 0;
		double timeSelection = 0;
		double timeQuick = 0;
		double timeMergeSortR = 0;
		double timeMergeSortI = 0;

		System.out.println(input);
		double tmpTime = 0.0;

		for (int i = 0; i < 3; i++) {
			values = Arrays.copyOf(tmp, tmp.length);
			tmpTime = getTime(values, "insertionSort");
			timeInsertion = timeInsertion + tmpTime;

			values = Arrays.copyOf(tmp, tmp.length);
			tmpTime = getTime(values, "selectionSort");
			timeSelection = timeSelection + tmpTime;

			values = Arrays.copyOf(tmp, tmp.length);
			tmpTime = getTime(values, "quickSort");
			timeQuick = timeQuick + tmpTime;

			values = Arrays.copyOf(tmp, tmp.length);
			tmpTime = getTime(values, "mergeSortRecursive");
			timeMergeSortR = timeMergeSortR + tmpTime;

			values = Arrays.copyOf(tmp, tmp.length);
			tmpTime = getTime(values, "mergeSortIterative");
			timeMergeSortI = timeMergeSortI + tmpTime;
		}

		averageTime(timeInsertion, "insertionSort");
		averageTime(timeSelection, "selectionSort");
		averageTime(timeQuick, "quickSort");
		averageTime(timeMergeSortR, "mergeSortRecursive");
		averageTime(timeMergeSortI, "mergeSortIterative");
	}

	public static void averageTime(double time, String funcType) {
		time = time / 3;
		DecimalFormat numberFormat = new DecimalFormat("#.00000");
		System.out.println("Time: " + numberFormat.format(time) + ". Function: " + funcType + ".");
	}

	public static double getTime(double[] a, String funcType) {
		double startTime = 0.0;
		double endTime = 0.0;
		double time = 0.0;

		switch (funcType) {
		case "insertionSort":
			startTime = System.nanoTime();
			insertionSort(a);
			endTime = System.nanoTime();
			break;
		case "selectionSort":
			startTime = System.nanoTime();
			selectionSort(a);
			endTime = System.nanoTime();
			break;
		case "quickSort":
			startTime = System.nanoTime();
			quickSort(a);
			endTime = System.nanoTime();
			break;
		case "mergeSortRecursive":
			startTime = System.nanoTime();
			mergeSortRecursive(a);
			endTime = System.nanoTime();
			break;
		case "mergeSortIterative":
			startTime = System.nanoTime();
			mergeSortIterative(a);
			endTime = System.nanoTime();
			break;
		}
		time = endTime - startTime;
		time = time / (1000000);
		return time;
	}

	public static double[] readInValues(String input, int length) {
		double[] numbers = new double[length];
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
			String number = bufferedReader.readLine();
			int counter = 0;
			while (number != null) {
				numbers[counter] = (Double.valueOf(number));
				number = bufferedReader.readLine();
				counter++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return numbers;
	}*/

    /**
     * Sorts an array of doubles using InsertionSort. This method is static, thus it
     * can be called as SortComparison.sort(a)
     *
     * @param a:
     *            An unsorted array of doubles.
     * @return array sorted in ascending order.
     *
     */
    static double[] insertionSort(double a[]) {
        double index;
        int j;
        for (int i = 1; i < a.length; i++) {
            index = a[i];
            j = i;
            while ((j > 0) && (a[j - 1] > index)) {
                a[j] = a[j - 1];
                j = j - 1;
            }
            a[j] = index;
        }
        return a;
    }

    /**
     * Sorts an array of doubles using Quick Sort. This method is static, thus it
     * can be called as SortComparison.sort(a)
     *
     * @param a:
     *            An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    public static double[] quickSort(double a[]) {
        if (a.length > 0) {
            return quickSortImp(a, 0, a.length - 1);
        } else {
            return a;
        }
    }

    public static double[] quickSortImp(double a[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(a, begin, end);

            quickSortImp(a, begin, partitionIndex - 1);
            quickSortImp(a, partitionIndex + 1, end);
        }
        return a;
    }

    private static int partition(double arr[], int begin, int end) {
        double pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                double swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        double swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }

    /**
     * Sorts an array of doubles using recursive implementation of Merge Sort. This
     * method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a:
     *            An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted
     *         order.
     */

    static double[] mergeSortRecursive(double a[]) {
        // todo: implement the sort
        double[] aux = new double[a.length];
        mergeSortRecursive(a, aux, 0, a.length - 1);
        return a;
    }

    private static void mergeSortRecursive(double[] a, double[] aux, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        mergeSortRecursive(a, aux, lo, mid);
        mergeSortRecursive(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }

    private static void merge(double[] a, double[] aux, int lo, int mid, int hi) {
        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }
        int i = lo;
        int j = mid + 1;
        for (int x = lo; x <= hi; x++) {
            if (i > mid) {
                a[x] = aux[j++];
            } else if (j > hi) {
                a[x] = aux[i++];
            } else if (aux[j] < aux[i]) {
                a[x] = aux[j++];
            } else {
                a[x] = aux[i++];
            }
        }
    }

    /**
     * Sorts an array of doubles using Merge Sort. This method is static, thus it
     * can be called as SortComparison.sort(a)
     *
     * @param a:
     *            An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    /**
     * Sorts an array of doubles using iterative implementation of Merge Sort. This
     * method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a:
     *            An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted
     *         order.
     */
    static double[] mergeSortIterative(double a[]) {
        // todo: implement the sort
        int length = a.length;
        double[] aux = new double[length];
        for (int subSize = 1; subSize < length; subSize = subSize + subSize) {
            for (int lo = 0; lo < length - subSize; lo += subSize + subSize) {
                merge(a, aux, lo, lo + subSize - 1, Math.min(lo + subSize + subSize - 1, length - 1));
            }
        }
        return a;
    }

    /**
     * Sorts an array of doubles using Selection Sort. This method is static, thus
     * it can be called as SortComparison.sort(a)
     *
     * @param a:
     *            An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    public static double[] selectionSort(double a[]) {
        int length = a.length;
        if (length > 0) {
            for (int i = 0; i < length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < length; j++)
                    if (a[j] < a[minIndex])
                        minIndex = j;

                double temp = a[minIndex];
                a[minIndex] = a[i];
                a[i] = temp;
            }
        }
        return a;
    }
}
