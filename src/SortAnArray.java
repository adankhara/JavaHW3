import java.lang.reflect.Array;
import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int[] a = new int[]{20, 7, 36, 98, 6, 6, 3, 1, 6, 0};
        String[] b = new String[]{"John", "Raj", "Harry", "Adam", "Krish", "Tanya", "Kim", "Viraj", "Natasha", "Sophie"};
        System.out.println("Original order of Array:");
        printArrays(a);
        printArrays(b);
        System.out.println("Sorted Array:");
        sortAnArray(a);
        printArrays(a);
        sortAnArray(b);
        printArrays(b);

    }

    private static void sortAnArray(int[] a)
    {
        for (int o = 0; o < a.length-1; o++) {
            for (int i=0;i<a.length-1;i++){
                if (a[i]>a[i+1]) {
                    int temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    private static void sortAnArray(String[] a)
    {
        for (int o = 0; o < a.length-1; o++) {
            for (int i=0;i<a.length-1;i++){
                if (a[i].compareTo(a[i+1])>0) {
                    String temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    private static void printArrays(String[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.printf("[%s], ", a[i]); }
        System.out.println();
    }
    private static void printArrays(int [] a){
        for (int i = 0; i < a.length; i++) {
            System.out.printf("[%d], ", a[i]); }
        System.out.println();

    }
}