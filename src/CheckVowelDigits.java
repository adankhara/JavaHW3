import java.util.Scanner;

public class CheckVowelDigits {
    int digits;
    int vowels;
    float digitPercentage;
    float vowelPercentage;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = scanner.next();


        CheckVowelDigits cwd = new CheckVowelDigits();
        cwd.calculate(s);

        System.out.printf("Number of digits: %2d, (%5f)\n", cwd.digits, cwd.digitPercentage);
        System.out.printf("Number of vowels: %2d, (%5f)", cwd.vowels, cwd.vowelPercentage);
    }


    public void calculate(String input) {
        if (input.length() == 0) {
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (isVowel(c)) {
                vowels++;
            } else if (isDigit(c)) {
                digits++;
            }
        }
        vowelPercentage = vowels * 100.0f / input.length();
        digitPercentage = digits * 100.0f / input.length();
    }

    private boolean isVowel(char vowel) {
        if (vowel == 'a' || vowel == 'A' || vowel == 'e' || vowel == 'E' || vowel == 'i' || vowel == 'I' || vowel == 'o' || vowel == 'O' || vowel == 'u' || vowel == 'U') {
            return true;
        }
        return false;
    }

    private boolean isDigit(char digit) {
        if (digit >= '0' && digit <= '9') {
            return true;
        }
        return false;
    }
}

