// c. Implement sort pada list nama provinsi minimal 10 data secara descending
import java.util.ArrayList;
import java.util.Collections;


public class No2c {
    public static void main(String[] args) {
        ArrayList<String> provinsi = new ArrayList<String>();
        provinsi.add("DKI Jakarta");
        provinsi.add("DIY");
        provinsi.add("Bali");
        provinsi.add("Aceh");
        provinsi.add("Bengkulu");
        provinsi.add("Riau");
        provinsi.add("Banten");
        provinsi.add("Gorontalo");
        provinsi.add("Maluku");
        provinsi.add("Papua");

        Collections.sort(provinsi, Collections.reverseOrder());
        for(String i : provinsi){
            System.out.println(i);
        }

    }
}
