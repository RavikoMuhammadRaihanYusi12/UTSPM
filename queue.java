import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue <String> que = new LinkedList();
        que.add("Diana");
        que.add("Cindy");
        que.add("Ani");
        que.add("Doni");
        que.add("Rudi");


        System.out.println("Kondisi awal Antrian : "+que);

        que.remove("Diana");
        que.remove("Cindy");
        que.remove("Ani");

        System.out.println("Jumlah antrian : " + que.size());
        System.out.println("Antrian terdepan : " + que.peek());

        que.add("Zaki");
        que.add("Nisa");

        System.out.println("Kondisi akhir antrian :"+que);
        System.out.println("Jumlah antrian : " + que.size());
        System.out.println("Antrian terdepan : " + que.peek());
    }
}