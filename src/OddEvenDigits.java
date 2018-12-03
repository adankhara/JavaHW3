public class OddEvenDigits {
    public static void main(String[] args)
    {
       sumOfOddEven();

    }
    private static void sumOfOddEven()
    {
        int i =34215;
        int oddNum =0;
        int evenNum =0;
        while (i>0){
            if (i%2==0){
                evenNum++;
            }
            else {
                oddNum++;
            }
            i=i/10;
        }
        System.out.println("Total odd numbers are:" + " " + oddNum);
        System.out.println("Total even numbers are:" + " " + evenNum);


    }
}
