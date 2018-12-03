import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        getSumOfDigits();

    }
    private static void getSumOfDigits(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any 5 digits number:");
        int i = scanner.nextInt();
        if (i<=9999 || i>=99999){
            System.err.println("Invalid Entry...!!!");
            return;
        }


        int sum =0;
        while (i!=0){
            sum +=i%10;
            i = i/10;
        }
        System.out.print("Sum of above digits is:" + " " + sum);

    }


}
