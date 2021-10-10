package Ruang;
import java.util.Scanner;
public class Bola {
    public static void main (String [] args) {
        Scanner nilai = new Scanner (System.in);
        double phi= 3.14 , jari ;
        System.out.println("Masukan Jari-Jari = ");
        jari = nilai.nextInt();
        double Luas , Volume ;
        Volume = 4/ (double) 3 * phi * jari * jari *jari;
        System.out.println("Volume Bola adalah = "+Volume);
        Luas = 4 * phi * jari * jari;
        System.out.println("Luas Permukaan Bola adalah = "+Luas);
    }
}