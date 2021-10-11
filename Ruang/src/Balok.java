import java.util.Scanner;

public class Balok extends BangunRuang{
    int panjang, lebar, tinggi;
    public Balok(){
        System.out.println("Menghitung Balok");
        Scanner nilai = new Scanner(System.in);
        System.out.print("\tMasukkan panjang : ");
        panjang = nilai.nextInt();
        System.out.print("\tMasukkan Lebar : ");
        lebar = nilai.nextInt();
        System.out.print("\tMasukkan Tinggi : ");
        tinggi = nilai.nextInt();
    }

    @Override
    public double volume() {
        return this.panjang * this.lebar * this.tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2 * (this.panjang * this.lebar + this.panjang * this.tinggi + this.lebar * this.tinggi);
    }
}
