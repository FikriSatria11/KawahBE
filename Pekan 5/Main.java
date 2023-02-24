import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5);
        PersegiPanjang persegiPanjang = new PersegiPanjang(10, 5);
        Segitiga segitiga = new Segitiga(10, 7, 10, 9, 8);
        Lingkaran lingkaran = new Lingkaran(7);

        List<BangunDatar> bangunDatar = List.of(persegi, persegiPanjang, segitiga, lingkaran);

        bangunDatar.forEach(BangunDatar::luas);
        bangunDatar.forEach(BangunDatar::keliling);
        
    }    
}
