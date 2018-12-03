public class InsertAnElements {
    public static void main(String[] args)
    {
        int [] source = new int[]{1, 4, 6,8,20,44};
        printArray(source);
        int[] target = insertAt(source,3,7);
        printArray(target);
    }
    private static void printArray(int[] a){
        for (int i =0 ; i < a.length; i++){
            System.out.printf("[%d]" ,a[i]);
        }
        System.out.println();
    }
    private static int[] insertAt(int [] source, int position, int element)
    {
        int [] target = new int [source.length + 1];

        for (int i=0;i<position;i++){
            target[i]=source[i];
        }

        target[position] = element;

        for (int i = position+1; i < target.length; i++){
            target[i] = source[i-1];
        }

        return target;
    }

}
