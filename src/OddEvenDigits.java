import java.util.Scanner;

public class OddEvenDigits {
    public static void main(String[] args)
    {
       sumOfOddEven();
    }
    private static void sumOfOddEven()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any 5 digits number:");
        int i = scanner.nextInt();
        if (i<9999 ||i >99999){
            System.err.println("Invalid Entry...!!!");
            return;
        }
        int j;
        j=i;
        int oddNum =0;
        int evenNum =0;
        int sumOfOdd=0;
        int sumOfEven=0;
        int num;
        while (i>0){
            if (i%2==0){
                evenNum++;
            }
            else {
                oddNum++;
            }
            i=i/10;
        }
        while (j>0){
            num = j%10;
            if (num%2==0){
                sumOfEven=sumOfEven+j%10;
            }
            else {
                sumOfOdd = sumOfOdd+j%10;
            }
            j=j/10;
        }
        System.out.println("Total odd numbers are:" + " " + oddNum);
        System.out.println("Total even numbers are:" + " " + evenNum);
        System.out.println("Total of odd numbers:"+" "+ sumOfOdd);
        System.out.println("Total of even numbers:" + " "+ sumOfEven);
    }
}
