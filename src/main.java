import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {

    public static void main(String args[]){
        double[] values = readInValues();
        selectionSort(values);
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
        int currSize;

        int leftStart;

        for (currSize = 1; currSize <= n-1;
             currSize = 2*currSize)
        {


            for (leftStart = 0; leftStart < n-1;
                 leftStart += 2*currSize)
            {

                int mid = leftStart + currSize - 1;

                int right_end = Math.min(leftStart
                        + 2*currSize - 1, n-1);

                merge(arr, leftStart, mid, right_end);
            }
        }
    }

    static void merge(double a[], int left, int mid, int right)
    {
        int i, j, k;
        int length1 = mid - left + 1;
        int length2 = right - mid;

        double l[] = new double[length1];
        double r[] = new double[length2];

        for (i = 0; i < length1; i++) {
            l[i] = a[left + i];
        }
        for (j = 0; j < length2; j++) {
            r[j] = a[mid + 1 + j];
        }

        i = 0;
        j = 0;
        k = left;
        while (i < length1 && j < length2)
        {
            if (l[i] <= r[j])
            {
                a[k] = l[i];
                i++;
            }
            else
            {
                a[k] = r[j];
                j++;
            }
            k++;
        }

        while (i < length1)
        {
            a[k] = l[i];
            i++;
            k++;
        }

        /* Copy the remaining elements of
        R[], if there are any */
        while (j < length2)
        {
            a[k] = r[j];
            j++;
            k++;
        }
    }


    public static double[] selectionSort(double a[]) {
        int length = a.length;

        for (int i = 0; i < length-1; i++)
        {
            int minIndex = i;
            for (int j = i+1; j < length; j++)
                if (a[j] < a[minIndex])
                    minIndex = j;

            double temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
        return a;
    }

}