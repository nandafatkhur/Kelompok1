import java.util.Scanner;

public class Bola extends BangunRuang{
    double jari , phi=3.14;
    public Bola(){
        System.out.println("Menghitung Bola");
        Scanner nilai = new Scanner(System.in);
        System.out.print("\tMasukkan Jari-jari : ");
        jari = nilai.nextInt();
    }

    @Override
    public double volume() {
        return 4/ (double) 3 * this.phi * this.jari * this.jari * this.jari;
    }

    @Override
    public double luasPermukaan() {
        return 4 * this.phi * this.jari * this.jari;
    }
}