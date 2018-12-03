public class SpecificValue {
    public static void main(String[] args) {
        int n =203 ;
        int a[] = new int[]{7,32,56,78,12,9,65,26,81,203};
        System.out.println("This is Array");

       for (int i =0;i<a.length;i++) {
           System.out.printf("[%d],", a[i]);
       }
        System.out.println();
        if(containsElement(a, n)){
            System.out.println("Array contains specific value of n:" + " " + n);
        }
        else{
            System.out.printf("Array doesn't contain specific value %d", n);
        }
    }

    private static boolean containsElement(int[] a, int n)
    {
        for (int i=0;i<a.length;i++){
            if (a[i]==n){
                return  true;

            }
        }
        return false;
    }
}

