import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class main {

    public static double[] readInValues(){
        double[] numbers = new double[10];
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("numbers10.txt"));
           String number = bufferedReader.readLine();
           int counter = 0;
            while (number != null) {
                numbers[counter] = (Double.valueOf(number));
                number = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static double[] insertionSort(double a[]) {

        return null;
    }

    public static double[] quickSort(double a[]) {
        return null;
    }

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