import java.util.Arrays;

public class Arraybil {
    public static void main(String[] args) {
        int[] bil = {23,15,19,28,32,6,45};

        System.out.println("Bilangan sebelum diurutkan : "+ Arrays.toString(bil));
        for(int i=0; i<bil.length; i++){
            for(int j=0; j<bil.length-1; j++){

                if(bil[j] > bil[j+1]){
                    int temp = bil[j];
                    bil[j]= bil[j+1];
                    bil[j+1] = temp;
                }

            }
        }
        System.out.println("Bilangan sesudah diurutkan : " + Arrays.toString(bil));
    }
}
