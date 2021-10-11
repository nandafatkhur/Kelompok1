package Ruang;
import java.util.Scanner;
public class Prisma extends BangunRuang{
    int alas , tinggi1 , tinggi2 ;
    public Prisma(){
        System.out.println("Menghitung Prisma");
        Scanner nilai = new Scanner (System.in);
        System.out.print("\tMasukan Alas Segitiga : ");
        alas = nilai.nextInt();
        System.out.print("\tMasukan Tinggi Segitiga : ");
        tinggi1 = nilai.nextInt();
        System.out.print("\tMasukan Tinggi Prisma : ");
        tinggi2 = nilai.nextInt();
    }

    @Override
    public double volume() {
        return 0.5 * this.alas * this.tinggi1 * this.tinggi2;
    }

    @Override
    public double luasPermukaan() {
        return this.tinggi2 * (3 * this.alas) + (2 * (0.5 * this.alas * this.tinggi1));
    }
}
