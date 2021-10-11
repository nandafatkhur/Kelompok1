import java.util.Scanner;

public class Lingkaran extends BangunDatar{
    double jari, phi=4.14;
    public Lingkaran(){
        System.out.println("Menghitung Lingkaran");
        Scanner nilai = new Scanner(System.in);
        System.out.print("\tMasukkan jari-jari : ");
        jari = nilai.nextInt();
    }

    @Override
    public double keliling() {
        return this.jari * phi * 2;
    }

    @Override
    public double luas() {
        return this.jari * this.jari * phi;
    }
}
