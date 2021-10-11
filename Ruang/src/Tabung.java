package Ruang;

import java.util.Scanner;

public class Tabung extends BangunRuang{
    double jari2, tinggi, phi=3.14;
    public Tabung(){
        System.out.println("Menghitung Tabung");
        Scanner nilai = new Scanner (System.in);
        System.out.print("\tMasukan Jari-Jari : ");
        jari2 = nilai.nextInt();
        System.out.print("\tMasukan Tinggi : ");
        tinggi = nilai.nextInt();
    }

    @Override
    public double volume() {
        return this.phi * this.jari2 * this.jari2 * this.tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2 * this.phi * this.jari2 * (this.jari2 + this.tinggi);
    }
}
