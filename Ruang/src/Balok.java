package Ruang;
import java.util.Scanner;
public class Balok {
    public static void main (String [] args) {
        Scanner nilai = new Scanner (System.in);
        int panjang , lebar , tinggi ;
        System.out.println("Masukan Panjang = ");
        panjang = nilai.nextInt();
        System.out.println("Masukan Lebar = ");
        lebar = nilai.nextInt();
        System.out.println("Masukan Tinggi = ");
        tinggi = nilai.nextInt();
        int Luas , Volume ;
        Volume = panjang * lebar * tinggi;
        System.out.println("Volume Balok adalah = "+Volume);
        Luas = (2 * (panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        System.out.println("Luas Permukaan Kubus adalah = "+Luas);
    }
}