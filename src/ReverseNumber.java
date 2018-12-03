import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {


      System.out.printf("Reverse Number:54 %d", getReverseNumber());
    }
    private static int getReverseNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any 5 digits number:");
        int i = scanner.nextInt();
       int  reverseNum =0;

       while (i!= 0){
           reverseNum = reverseNum *10 + i%10;
           i=i/10;
       }

        return reverseNum;
    }
}
