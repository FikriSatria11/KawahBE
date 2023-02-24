public class Lingkaran {
    public float radius;

    public void luas(){
        float luas = (float)(Math.PI*radius*radius);
        System.out.printf("Luas Lingkaran = %.2f \n",luas);
    }

    public void keliling(){
        float keliling = (float)(2*Math.PI*radius);
        System.out.printf("Keliling Lingkaran = %.2f \n",keliling);
    }
}
