public class PersegiPanjang {
    public int panjang;
    public int lebar;

    public void luas(){
        int luas = panjang*lebar;
        System.out.println("Luas Persegi Panjang = "+luas);
    }
    
    public void keliling(){
        int keliling = (2*panjang)+(2*lebar);
        System.out.println("Keliling Persegi Panjang = "+keliling);
    }

}
