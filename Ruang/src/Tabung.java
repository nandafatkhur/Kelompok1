package Ruang;
import java.util.Scanner;
public class Tabung {
    public static void main (String [] args) {
        Scanner nilai = new Scanner (System.in);
        double phi= 3.14 , jari , tinggi ;
        System.out.println("Masukan Jari-Jari = ");
        jari = nilai.nextInt();
        System.out.println("Masukan Tinggi = ");
        tinggi = nilai.nextInt();
        double Luas , Volume ;
        Volume = phi * jari * jari * tinggi;
        System.out.println("Volume Tabung adalah = "+Volume);
        Luas = 2 * phi * jari * (jari + tinggi);
        System.out.println("Luas Permukaan Tabung adalah = "+Luas);
    }
}