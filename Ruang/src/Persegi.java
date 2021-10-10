package BangunDatar;
import java.util.Scanner;
public class Persegi {
    public static void main (String [] args) {
        Scanner nilai = new Scanner (System.in);
        int sisi ;
        System.out.println("Masukan sisi = ");
        sisi = nilai.nextInt();
        int Luas , Keliling ;
        Keliling = 4*sisi ;
        System.out.println("Keliling Persegi = "+Keliling);
        Luas = sisi * sisi;
        System.out.println("Luas Persegi = "+Luas);
    }
}