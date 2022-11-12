import java.util.ArrayList;

public class ArraylistStack {
    public static void main(String[] args) {
        ArrayList Alist = new ArrayList();

        Alist.add("X");
        Alist.add("Y");
        Alist.add("Z");
        System.out.println("Keadaan 1 "+Alist);

        Alist.remove("X");

        Alist.add("R");
        Alist.add("S");
        Alist.add("T");

        System.out.println("Keadaan 2 "+Alist);

    }
}
