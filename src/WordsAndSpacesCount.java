import java.util.Scanner;

public class WordsAndSpacesCount {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int numberOfWords = getNumberOfWords(s);
        System.out.printf("Number of words in string are :%d and spaces :%d", numberOfWords, numberOfWords-1);
    }
    private static int getNumberOfWords(String input){
        int count = 1;
        for (int i =0; i< input.length(); i++){
            char c = input.charAt(i);

            if (c == ' ' )
            {
                if (i+1 != input.length())
                {
                    char nextc = input.charAt(i+1);
                    if (nextc != ' ')
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
