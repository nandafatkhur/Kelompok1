import java.util.Scanner;

public class Persegi extends BangunDatar{
    int sisi;
    public Persegi(){
        System.out.println("Menghitung persegi");
        Scanner nilai = new Scanner(System.in);
        System.out.print("\tMasukkan sisi : ");
        sisi = nilai.nextInt();
    }

    @Override
    public double keliling() {
        return this.sisi * 4;
    }

    @Override
    public double luas() {
        return this.sisi * this.sisi;
    }
}
