package Ruang;
import java.util.Scanner;
public class LimasSegiTiga {
    public static void main (String [] args) {
        Scanner nilai = new Scanner (System.in);
        int alas , tinggi , luas1 , luas2 , luas3;
        System.out.println("Masukan Alas = ");
        alas = nilai.nextInt();
        System.out.println("Masukan Tinggi = ");
        tinggi = nilai.nextInt();
        System.out.println("Masukan Luas Segitiga 1 = ");
        luas1 = nilai.nextInt();
        System.out.println("Masukan Luas Segitiga 2 = ");
        luas2 = nilai.nextInt();
        System.out.println("Masukan Luas Segitiga 3 = ");
        luas3 = nilai.nextInt();
        double Luas , Volume ;
        Volume = 1/ (double) 3 * 0.5 * alas * tinggi;
        System.out.println("Volume Limas Segitiga adalah = "+Volume);
        Luas = 0.5 * alas * tinggi + (luas1 + luas2 + luas3);
        System.out.println("Luas Permukaan Limas Segitiga adalah = "+Luas);
    }
}