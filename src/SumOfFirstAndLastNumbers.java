import java.util.Scanner;

public class SumOfFirstAndLastNumbers {
    public static void main(String[] args) {
        findSumOfFirstAndLast();

    }
    private static void findSumOfFirstAndLast(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter 5 digit number:");
        int i = scanner.nextInt();

        int first=0;
        int last =i%10;
        while (i!=0){
            first =i%10;
            i = i/10;
        }

        int sum = first+last;
        System.out.println("Sum of first and last digit is:" + " " + sum);

    }
}
