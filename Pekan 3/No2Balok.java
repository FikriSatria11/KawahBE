import java.util.Scanner;

public class No2Balok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Panjang : ");
        double panjang = scan.nextDouble();
        System.out.print("Masukkan Lebar : ");
        double lebar = scan.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        double tinggi = scan.nextDouble();
        double volume = panjang*lebar*tinggi;
        System.out.printf("Volume balok = %.2f",volume);
    }
}
