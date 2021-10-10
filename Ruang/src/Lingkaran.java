package BangunDatar;
import java.util.Scanner;
public class Lingkaran {
    public static void main (String [] args) {
        Scanner nilai = new Scanner (System.in);
        int jari ;
        System.out.println("Masukan jari-jari = ");
        jari = nilai.nextInt();
        double Luas , Keliling , phi=3.14 ;
        Luas = phi * jari * jari ;
        System.out.println("Luas Lingkaran = "+Luas);
        Keliling = 2 * phi * jari ;
        System.out.println("Keliling Lingkaran = "+Keliling);

    }
}
