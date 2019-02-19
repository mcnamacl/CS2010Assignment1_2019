import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class main {

    public static void main(String args[]){
        double[] values = readInValues();
        values = insertionSort(values);
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

//    public double[] quickSort(double a[]){
//        return quickSortImp(a);
//    }
//
//    public double[] quickSortImp(double a[], int begin, int end) {
//        if (begin < end) {
//            int partitionIndex = partition(a, begin, end);
//
//            quickSortImp(a, begin, partitionIndex-1);
//            quickSortImp(a, partitionIndex+1, end);
//        }
//        return a;
//    }

//    private int partition(double arr[], int begin, int end) {
//        double pivot = arr[end];
//        double i = (begin-1);
//
//        for (int j = begin; j < end; j++) {
//            if (arr[j] <= pivot) {
//                i++;
//
//                int swapTemp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = swapTemp;
//            }
//        }
//
//        int swapTemp = arr[i+1];
//        arr[i+1] = arr[end];
//        arr[end] = swapTemp;
//
//        return i+1;
//    }

    public static double[] mergeSortRecursive(double a[]) {
        return null;
    }

    public static double[] mergeSortIterative(double a[]) {
        return null;
    }

    public static double[] selectionSort(double a[]) {
        return null;
    }

}