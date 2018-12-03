import java.util.Scanner;

public class AscendingOrder
{
    public static void main(String[] args)
    {
        int [] a = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements of the array:\n");
        for(int i = 0; i<10; i++){
            a[i] = scan.nextInt();
        }
        System.out.println("The elements of the Array are:");
        printingOfArray(a);
        ascendingOrderOfArray(a);
        System.out.println();
        System.out.println("Ascending order of Array:");
        printingOfArray(a);
    }
    public static void printingOfArray(int [] a)
    {
        for(int i = 0; i<10; i++)
            System.out.printf("[%d], ", a[i]);
    }
    public static void ascendingOrderOfArray(int [] a)
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


}

