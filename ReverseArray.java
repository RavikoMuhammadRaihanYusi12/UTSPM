public class ReverseArray {
    public static void main(String[] args) {
        int arry[] = {23, 15, 19, 28, 32, 6, 45};
        int arry2[] = {6, 15, 19, 23, 28, 32, 45};
        System.out.println("Reverse Order Array 2 :");
        for (int i = arry2.length - 1; i >= 0; i--) {
            System.out.println(arry[i] + "");
        }
        System.out.println("Reverse Order Array :");
        for(int i = arry.length - 1; i>=0;i--){
            System.out.println(arry[i] + "");
        }
    }
}
