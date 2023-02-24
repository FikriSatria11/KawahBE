public class Segitiga extends BangunDatar {
    int alas;
    int tinggi;
    int sisi1;
    int sisi2;
    int sisi3;

    public Segitiga(int alas, int tinggi, int sisi1, int sisi2, int sisi3){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    @Override
    public void luas(){
        float luas = (this.alas * this.tinggi)/2;
        System.out.println("Luas Segitiga = "+luas);
    }

    @Override
    public void keliling(){
        int keliling = this.sisi1+this.sisi2+this.sisi3;
        System.out.println("Keliling Segitiga = "+keliling);
    }
}
