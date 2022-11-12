import java.util.Stack;

public class stack2 {
    public static void main(String[] args) {
        Stack <String> buku = new Stack<>();

        buku.add("Pemograman Mahir");
        buku.add("Sistem Informasi");
        buku.add("All About Java");

        System.out.println(buku.pop());
        System.out.println(buku.pop());
        System.out.println(buku.pop());
        System.out.println(buku);

    }
}
