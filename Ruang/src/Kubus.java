package Ruang;
import java.util.Scanner;
public class Kubus {
    public static void main (String [] args) {
        Scanner nilai = new Scanner (System.in);
        int sisi ;
        System.out.println("Masukan Sisi = ");
        sisi = nilai.nextInt();
        int Luas , Volume ;
        Volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus adalah = "+Volume);
        Luas = 6 * sisi * sisi;
        System.out.println("Luas Permukaan Kubus adalah = "+Luas);
    }
}