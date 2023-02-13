// a. Buatlah program untuk input nama anda dan output kalimat "Selamat datang di bootcamp Kawah Edukasi, {namaAnda}"

import java.util.Scanner;

public class No1a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String nama = scan.nextLine();
        System.out.printf("Selamat datang di bootcamp Kawah Edukasi, "+ nama);
    }    
}
