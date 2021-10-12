import java.util.Scanner;

public class LimasSegiempat extends BangunRuang{
    int tinggi , sisi , luas1 , luas2 , luas3 , luas4;
    public LimasSegiempat(){
        System.out.println("Menghitung Limas Segi Empat (Persegi)");
        Scanner nilai = new Scanner (System.in);
        System.out.print("\tMasukan Tinggi = ");
        tinggi = nilai.nextInt();
        System.out.print("\tMasukan Sisi Alas = ");
        sisi = nilai.nextInt();
        System.out.print("\tMasukan Luas Segitiga 1 = ");
        luas1 = nilai.nextInt();
        System.out.print("\tMasukan Luas Segitiga 2 = ");
        luas2 = nilai.nextInt();
        System.out.print("\tMasukan Luas Segitiga 3 = ");
        luas3 = nilai.nextInt();
        System.out.print("\tMasukan Luas Segitiga 4 = ");
        luas4 = nilai.nextInt();
    }

    @Override
    public double volume() {
        return 1/ (double) 3 * this.sisi * this.sisi * this.tinggi;
    }

    @Override
    public double luasPermukaan() {
        return this.sisi * this.sisi + (this.luas1 + this.luas2 + this.luas3 + this.luas4);
    }
}