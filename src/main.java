import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {

    public static void main(String args[]){
        double[] values = readInValues();
        mergeSortRecursive(values);
        for (int i = 0; i < values.length; i++){
            System.out.println(values[i]);
        }
    }

    public static double[] readInValues(){
        double[] numbers = new double[10];
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\mcnam\\Documents\\GitHub\\assignment\\src\\numbers10.txt"));
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
    }

    public static double[] insertionSort(double a[]) {
        int length = a.length;
        for (int i = 1; i < length; ++i){
            double key = a[i];
            int j = i-1;

            while (j >= 0 && a[j] > key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
        return a;
    }

    public static double[] quickSort(double a[]){
        return quickSortImp(a, 0, a.length-1);
    }

    public static double[] quickSortImp(double a[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(a, begin, end);

            quickSortImp(a, begin, partitionIndex-1);
            quickSortImp(a, partitionIndex+1, end);
        }
        return a;
    }

    private static int partition(double arr[], int begin, int end) {
        double pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                double swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        double swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

    public static double[] mergeSortRecursive(double a[]) {
        return mergeSort(a, 0, a.length-1);
    }

    public static double[] mergeSort(double list[],int low, int high){

        if (low >= high)
        {
            return list;
        }

        int middle = (low + high) / 2;

        mergeSort(list, low, middle);

        mergeSort(list, middle + 1, high);

        mergeR(list, low,middle,high);

        return list;

    }


    private static void mergeR(double list[], int low, int middle, int high) {

        int IstList_end = middle;

        int IIndList_start = middle + 1;

        int l = low;

        while ((l <= IstList_end) && (IIndList_start <= high)) {

            if (list[low] < list[IIndList_start]) {

                low++;

            } else {

                double temp = list[IIndList_start];

                for (int j = IIndList_start - 1; j >= low; j--) {

                    list[j + 1] = list[j];

                }

                list[low] = temp;

                low++;

                IstList_end++;

                IIndList_start++;

            }

        }
    }

    static void iterativeMergeSort(double[] a){
        mergeSort(a, a.length);
    }


    static void mergeSort(double arr[], int n)
    {

        // For current size of subarrays to
        // be merged curr_size varies from
        // 1 to n/2
        int curr_size;

        // For picking starting index of
        // left subarray to be merged
        int left_start;


        // Merge subarrays in bottom up
        // manner. First merge subarrays
        // of size 1 to create sorted
        // subarrays of size 2, then merge
        // subarrays of size 2 to create
        // sorted subarrays of size 4, and
        // so on.
        for (curr_size = 1; curr_size <= n-1;
             curr_size = 2*curr_size)
        {

            // Pick starting point of different
            // subarrays of current size
            for (left_start = 0; left_start < n-1;
                 left_start += 2*curr_size)
            {
                // Find ending point of left
                // subarray. mid+1 is starting
                // point of right
                int mid = left_start + curr_size - 1;

                int right_end = Math.min(left_start
                        + 2*curr_size - 1, n-1);

                // Merge Subarrays arr[left_start...mid]
                // & arr[mid+1...right_end]
                merge(arr, left_start, mid, right_end);
            }
        }
    }

    /* Function to merge the two haves arr[l..m] and
    arr[m+1..r] of array arr[] */
    static void merge(double arr[], int l, int m, int r)
    {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 = r - m;

        /* create temp arrays */
        double L[] = new double[n1];
        double R[] = new double[n2];

        /* Copy data to temp arrays L[]
        and R[] */
        for (i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (j = 0; j < n2; j++)
            R[j] = arr[m + 1+ j];

        /* Merge the temp arrays back into
        arr[l..r]*/
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy the remaining elements of
        L[], if there are any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy the remaining elements of
        R[], if there are any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    public static double[] selectionSort(double a[]) {
        return null;
    }

}