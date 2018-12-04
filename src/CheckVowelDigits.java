import java.util.Scanner;

public class CheckVowelDigits {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = scanner.next();

        float percentage = 100 * checkDigits(s)/countTotal(s);
        float percentage1 = 100*checkVowels(s)/countTotal(s);
        System.out.printf("Number of digits: %2s, (%5f)\n", checkDigits(s), percentage);
        System.out.printf("Number of vowels: %2s, (%5f)", checkVowels(s), percentage1);
    }
    private static float checkVowels(String input)
    {
      int countVowel = 0;

      for (int i=0;i<input.length();i++)
      {
          char vowel = input.charAt(i);
          if (vowel=='a'|| vowel=='A' || vowel=='e' || vowel=='E' || vowel=='i' || vowel=='I' || vowel=='o' || vowel=='O' || vowel=='u' || vowel=='U')
          {
              countVowel++;
          }
      }

      return countVowel;
    }
    private static float checkDigits(String input)
    {
        int countDigit = 0;

        for (int i=0;i<input.length();i++)
        {
            char digit = input.charAt(i);
            if (digit>='0' && digit<='9')
            {
                countDigit++;
            }
        }

        return countDigit;
    }
    private static float countTotal(String input)
    {
        int totalCount=0;
        for (int i=0; i<input.length();i++){
            char total = input.charAt(i);
            totalCount++;
        }

        return totalCount;
    }



}
