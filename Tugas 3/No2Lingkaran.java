// a. Implentasi rumus luas lingkaran dan volume balok pada bahasa Java

import java.util.Scanner;

public class No2Lingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jari-jari : ");
        double radius = scan.nextDouble();
        double luas = Math.PI * Math.pow(radius, 2);
        System.out.printf("luas lingkaran adalah %.2f ",luas);
    }    
}
