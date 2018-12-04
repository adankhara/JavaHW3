import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number:");
        int i = scanner.nextInt();
        int temp = i;
        int  reverseNum =0;

        while (i!= 0){
            reverseNum = reverseNum *10 + i%10;
            i=i/10;
        }
        if (reverseNum==temp)
        {
            System.out.println("This is  a palindrome number:");
        }
        else
            {
                System.out.println("This is not a palindrome number:");
            }

    }
}
