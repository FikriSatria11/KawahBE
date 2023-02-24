public class Lingkaran extends BangunDatar {
    float radius;

    public Lingkaran(float radius){
        this.radius = radius;
    }

    @Override
    public void luas(){
        float luas = (float)(Math.PI*this.radius*this.radius);
        System.out.printf("Luas Lingkaran = %.2f \n",luas);
    }

    @Override
    public void keliling(){
        float keliling = (float)(2*Math.PI*this.radius);
        System.out.printf("Keliling Lingkaran = %.2f \n",keliling);
    }
}
