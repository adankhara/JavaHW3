public class CommonElements {
    public static void main(String[] args)
    {
        String [] a = new String[]{"Raj","Rita","Natasha","Adam","Philip","Mona","Hary","David","Tanya"};
        String [] b = new String[]{"Mary","Nina","Robert","Tanya","Tom","Raj","Mahesh","Natasha","Mina"};
        System.out.print("Elements of Array [a] is:" + " ");
        for (int i =0;i<a.length;i++){
            System.out.printf("[%s],", a[i]);
        }
        System.out.println();
        System.out.print("Elements of Array [b] is:" + " ");
        for (int i =0;i<a.length;i++){
            System.out.printf("[%s],", b[i]);
        }
        System.out.println();
        System.out.print("Common elements of both Array are:");
        findCommonElements(a,b);
    }

    private static void findCommonElements(String[]a,String[]b)
    {
        for (int j =0;j<a.length-1;j++)
        {
           for (int i =0; i<a.length-1;i++)
           {
               if (a[j].equals(b[i])){

                   System.out.printf("[%s],", a[j]);
               }

           }
        }

    }
}
