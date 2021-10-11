import java.util.Scanner;

public class PersegiPanjang extends BangunDatar {
    int panjang, lebar;
    public PersegiPanjang(){
        System.out.println("Menghitung Persegi Panjang");
        Scanner nilai = new Scanner(System.in);
        System.out.print("\tMasukkan panjang : ");
        panjang = nilai.nextInt();
        System.out.print("\tMasukkan lebar: ");
        lebar = nilai.nextInt();
    }

    @Override
    public double keliling() {
        return this.panjang * 2 + this.lebar * 2;
    }

    @Override
    public double luas() {
        return this.panjang * this.lebar;
    }
}
