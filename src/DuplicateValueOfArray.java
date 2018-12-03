public class DuplicateValueOfArray {
    public static void main(String[] args) {
        int a[] = new int[]{345, 22, 5, 7, 12, 9, 5, 54, 28, 4};
        System.out.println("This Array contains:");
        for (int i=0;i<a.length;i++) {
            System.out.printf("[%d],", a[i]);
        }
        System.out.println();
        int index = findDuplicateValue(a);
        if (index>=0){
            System.out.println("Array contains duplicate value of:" +" "+ a[index]);
        }
        else {
            System.out.println("Array does not contain duplicate value:");
        }
    }
    private static int findDuplicateValue(int [] a){
        for (int j=0; j<a.length-1;j++) {
            for (int i=0; i < a.length ; i++) {
                if (a[j] == a[i]&& i!=j) {
                    return j;
                }
            }
        }
            return -1;

    }
}
