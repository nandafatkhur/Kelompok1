import java.util.Scanner;

public class Kubus extends BangunRuang{
    int sisi;
    public Kubus(){
        System.out.println("Menghitung Kubus");
        Scanner nilai = new Scanner(System.in);
        System.out.print("\tMasukkan sisi : ");
        sisi = nilai.nextInt();
    }

    @Override
    public double volume() {
        return this.sisi * this.sisi * this.sisi;
    }

    @Override
    public double luasPermukaan() {
        return 6 * (this.sisi * this.sisi);
    }
}
