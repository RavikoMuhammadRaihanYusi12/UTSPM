import java.util.Arrays;

public class ArrayGabung {
    public static void main(String[] args) {
        int[] Array1 = {23,15,19,28,32,6,45};
        int[] Array2 = {6,15,19,23,28,32,45};
        int aLen = Array1.length;
        int bLen = Array2.length;
        int[] result = new int[aLen + bLen];

        System.arraycopy(Array1, 0, result, 0, aLen);
        System.arraycopy(Array2, 0, result, aLen, bLen);

        System.out.println(Arrays.toString(result));
    }
}
