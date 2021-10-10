package Ruang;
import java.util.Scanner;
public class LimasSegiEmpat {
    public static void main (String [] args) {
        Scanner nilai = new Scanner (System.in);
        int alas , tinggi , sisi , luas1 , luas2 , luas3 , luas4;
        System.out.println("Masukan Alas = ");
        alas = nilai.nextInt();
        System.out.println("Masukan Tinggi = ");
        tinggi = nilai.nextInt();
        System.out.println("Masukan Sisi Alas = ");
        sisi = nilai.nextInt();
        System.out.println("Masukan Luas Segitiga 1 = ");
        luas1 = nilai.nextInt();
        System.out.println("Masukan Luas Segitiga 2 = ");
        luas2 = nilai.nextInt();
        System.out.println("Masukan Luas Segitiga 3 = ");
        luas3 = nilai.nextInt();
        System.out.println("Masukan Luas Segitiga 4 = ");
        luas4 = nilai.nextInt();
        double Luas , Volume ;
        Volume = 1/ (double) 3 * sisi * sisi * tinggi;
        System.out.println("Volume Limas Segi Empat adalah = "+Volume);
        Luas = sisi * sisi + (luas1 + luas2 + luas3 + luas4);
        System.out.println("Luas Permukaan Limas Segi Empat adalah = "+Luas);
    }
}