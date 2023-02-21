// a. List Nama makanan minimal 10 data
import java.util.ArrayList;

public class No2a {
    public static void main(String[] args) {
        ArrayList<String> makanan = new ArrayList<String>();
        makanan.add("Bakso");
        makanan.add("Nasi");
        makanan.add("Ayam Bakar");
        makanan.add("Ikan Goreng");
        makanan.add("Pecel");
        makanan.add("Gado-gado");
        makanan.add("Mi Kuah");
        makanan.add("perkedel");
        makanan.add("Sup");
        makanan.add("Kue");

        System.out.println(makanan.size());
    }
}
