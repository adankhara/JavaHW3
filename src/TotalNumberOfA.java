public class TotalNumberOfA {
    public static void main(String[] args) {
        String s = "Asha";
        System.out.printf("Number of a in %s : %d", s, countA(s));
    }

    private static int countA(String s)
    {
        int counts = 0;
        for (int i=0; i<s.length(); i++)
        {
            if (s.charAt(i) == 'a' || s.charAt(i)=='A')
                counts++;
        }
        return counts;
    }
}
