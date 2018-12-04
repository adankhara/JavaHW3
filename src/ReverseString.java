import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String input=scanner.next();
        char reverse;
        int i=input.length()-1;
        while ( i>=0){
            reverse = input.charAt(i);
            System.out.print(reverse);
            i--;

        }
//        for (int i = input.length()-1;i>=0;i--)
//        {
//            reverse = input.charAt(i);
//            System.out.print(reverse);
//
//        }


    }
}
