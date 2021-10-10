package BangunDatar;
import java.util.Scanner;
public class Segitiga {
    public static void main (String [] args) {
        Scanner nilai = new Scanner (System.in);
        int alas , tinggi ;
        System.out.println("Masukan alas = ");
        alas = nilai.nextInt();
        System.out.println("Masukan tinggi = ");
        tinggi = nilai.nextInt();
        double Luas , Keliling ;
        Luas = 0.5 * alas * tinggi ;
        System.out.println("Luas Segitiga = "+Luas);
        Keliling = 3 * alas ;
        System.out.println("Keliling Segitiga = "+Keliling);

    }
}
