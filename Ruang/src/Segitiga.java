import java.util.Scanner;

public class Segitiga extends BangunDatar{
    int alas, tinggi;
    public Segitiga(){
        System.out.println("Menghitung Segitiga");
        Scanner nilai = new Scanner(System.in);
        System.out.print("\tMasukkan alas : ");
        alas = nilai.nextInt();
        System.out.print("\tMasukkan tinggi : ");
        tinggi = nilai.nextInt();
    }

    @Override
    public double keliling() {
        return this.alas * 3;
    }

    @Override
    public double luas() {
        return this.alas * 0.5 * tinggi;
    }
}
