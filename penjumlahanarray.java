import java.util.Arrays;

public class penjumlahanarray {
    public static void main(String[] args) {
        int [] bil = {23,15,19,28,32,6,45};
        int sum = 0;
        //Advanced for loop
        for( int num : bil) {
            sum = sum+num;
        }
        System.out.println("Jumlah Dari Semua Elemen Array Adalah:"+sum);
    }
}
