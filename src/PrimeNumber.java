import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = scanner.nextInt();
        if (findPrimeNumber(num)){
            System.out.println("It's a prime number:");
        }
        else {
            System.out.println("It's not a prime number:");
        }
    }
    private static boolean findPrimeNumber(int num)
    {
        int i=2;
        while (i<num/2){
            if (num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
