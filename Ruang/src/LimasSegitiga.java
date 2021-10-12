import java.util.Scanner;

public class LimasSegitiga extends BangunRuang{
    int alas , tinggi , luas1 , luas2 , luas3;
    public LimasSegitiga(){
        System.out.println("Menghitung Limas Segitiga");
        Scanner nilai = new Scanner (System.in);
        System.out.print("\tMasukan Alas = ");
        alas = nilai.nextInt();
        System.out.print("\tMasukan Tinggi = ");
        tinggi = nilai.nextInt();
        System.out.print("\tMasukan Luas Segitiga 1 = ");
        luas1 = nilai.nextInt();
        System.out.print("\tMasukan Luas Segitiga 2 = ");
        luas2 = nilai.nextInt();
        System.out.print("\tMasukan Luas Segitiga 3 = ");
        luas3 = nilai.nextInt();
    }

    @Override
    public double volume() {
        return 1/ (double) 3 * 0.5 * this.alas * this.tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 0.5 * this.alas * this.tinggi + (this.luas1 + this.luas2 + this.luas3);
    }
}