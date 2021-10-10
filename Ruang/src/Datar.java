package BangunDatar;
import java.util.Scanner;
public class Datar {
    public static void main (String [] args) {
        Scanner nilai = new Scanner (System.in);
        int panjang , lebar ;
        System.out.println("Masukan panjang = ");
        panjang = nilai.nextInt();
        System.out.println("Masukan lebar = ");
        lebar = nilai.nextInt();
        int Luas , Keliling ;
        Keliling = 2*panjang + 2*lebar;
        System.out.println("Keliling Persegi Panjang = "+Keliling);
        Luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang = "+Luas);
    }
}