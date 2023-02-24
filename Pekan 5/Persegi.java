public class Persegi extends BangunDatar {
    int sisi;

    public Persegi(int sisi){
        this.sisi = sisi;
    }
    
    @Override
    public void luas(){
        int luas = this.sisi*this.sisi;
        System.out.println("Luas Persegi = "+luas);
    }

    @Override
    public void keliling(){
        int keliling = 4*this.sisi;
        System.out.println("Keliling Persegi = "+keliling);
    }
}
