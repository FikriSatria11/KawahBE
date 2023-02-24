public class App {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.sisi = 5;

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 10;
        persegiPanjang.lebar = 5;

        Segitiga segitiga = new Segitiga();
        segitiga.alas = 10;
        segitiga.tinggi = 7;
        segitiga.sisi1 = 10;
        segitiga.sisi2 = 9;
        segitiga.sisi3 = 8;

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.radius = 7;


        persegi.luas();
        persegi.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        segitiga.luas();
        segitiga.keliling();

        lingkaran.luas();
        lingkaran.keliling();
        
    }    
}
