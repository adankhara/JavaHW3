public class EqualityOf2Array {
    public static void main(String[] args)
    {
        int [] a = new int[]{1,2,3,4};
        int [] b = new int[]{3,2,4,1};
        int [] c = new int[]{3,2,4,1};
        System.out.printf("Array a equals b is %s\n",isEqual(a,b));

        System.out.printf("Array c equals b is %s",isEqual(c,b));
    }
    private static boolean isEqual(int []source, int []target)
    {
     if (source.length!=target.length){
         return false;
     }
     for (int i=0; i<source.length;i++){
         if (source[i]!=target[i]){
             return false;
         }
     }
     return true;
    }
}
