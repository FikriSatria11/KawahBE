public class Segitiga {
    public int alas;
    public int tinggi;
    public int sisi1;
    public int sisi2;
    public int sisi3;

    public void luas(){
        float luas = (alas * tinggi)/2;
        System.out.println("Luas Segitiga = "+luas);
    }

    public void keliling(){
        int keliling = sisi1+sisi2+sisi3;
        System.out.println("Keliling Segitiga = "+keliling);
    }
}
