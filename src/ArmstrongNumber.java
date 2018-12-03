import javafx.scene.transform.Scale;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        findArmstrongNumber();
    }
    private static void findArmstrongNumber() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a positive number:");
        int i = scanner.nextInt();
        int j = 0;
        int num,temp;
        temp=i;
        while (i != 0) {
            num = i % 10;
            j += num * num * num;
            i = i / 10;
        }
        if (temp == j){
            System.out.println("It's an armstrong number");
        }
        else {
            System.out.println("It's not an armstrong number");
        }


    }
}
