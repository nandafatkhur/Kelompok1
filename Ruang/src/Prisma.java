package Ruang;
import java.util.Scanner;
public class Prisma {
    public static void main (String [] args) {
        Scanner nilai = new Scanner (System.in);
        int alas , tinggi1 , tinggi2 ;
        System.out.println("Masukan Alas Segitiga = ");
        alas = nilai.nextInt();
        System.out.println("Masukan Tinggi Segitiga = ");
        tinggi1 = nilai.nextInt();
        System.out.println("Masukan Tinggi Prisma = ");
        tinggi2 = nilai.nextInt();
        double Luas , Volume ;
        Volume = 0.5 * alas * tinggi1 * tinggi2;
        System.out.println("Volume Prisma adalah = "+Volume);
        Luas = tinggi2 * (3 * alas) + (2 * (0.5 * alas * tinggi1));
        System.out.println("Luas Permukaan Prisma adalah = "+Luas);
    }
}