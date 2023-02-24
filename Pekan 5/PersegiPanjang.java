public class PersegiPanjang extends BangunDatar{
    int panjang;
    int lebar;

    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void luas(){
        int luas = this.panjang*this.lebar;
        System.out.println("Luas Persegi Panjang = "+luas);
    }

    @Override
    public void keliling(){
        int keliling = (2*this.panjang)+(2*this.lebar);
        System.out.println("Keliling Persegi Panjang = "+keliling);
    }

}
