// d. Implement penghapusan data untuk 5 data yang berbeda dari list bahasa pemograman yang berisikan 12 data
import java.util.ArrayList;

public class No2d {
    public static void main(String[] args) {
        ArrayList<String> bahasaPemrograman = new ArrayList<String>();
        bahasaPemrograman.add("Javascript");
        bahasaPemrograman.add("Python");
        bahasaPemrograman.add("Java");
        bahasaPemrograman.add("C");
        bahasaPemrograman.add("C++");
        bahasaPemrograman.add("C#");
        bahasaPemrograman.add("Ruby");
        bahasaPemrograman.add("PHP");
        bahasaPemrograman.add("Kotlin");
        bahasaPemrograman.add("Dart");
        bahasaPemrograman.add("Swift");
        bahasaPemrograman.add("Go");
        
        System.out.println(bahasaPemrograman.size());
        System.out.println(bahasaPemrograman);

        bahasaPemrograman.remove("C");
        bahasaPemrograman.remove("PHP");
        bahasaPemrograman.remove("Go");
        bahasaPemrograman.remove("Dart");
        bahasaPemrograman.remove("Java");
        
        System.out.println(bahasaPemrograman);
        System.out.println(bahasaPemrograman.size());
    }
}
