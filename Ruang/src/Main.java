public class Main {
    public static void main(String[] args) {
        System.out.println("Menghitung Objek 2D");

        BangunDatar bangungDatar = new BangunDatar();

        //persegi
        Persegi persegi = new Persegi();

        bangungDatar.keliling();
        System.out.println("\tKeliling Persegi : "+persegi.keliling());
        bangungDatar.luas();
        System.out.println("\tLuas Persegi : "+persegi.luas());

        //segitiga
        Segitiga segitiga = new Segitiga();

        bangungDatar.keliling();
        System.out.println("\tKeliling Segitiga : "+segitiga.keliling());
        bangungDatar.luas();
        System.out.println("\tLuas Segitiga : "+segitiga.luas());

        //persegi panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang();

        bangungDatar.keliling();
        System.out.println("\tKeliling Persegi Panjang : "+persegiPanjang.keliling());
        bangungDatar.luas();
        System.out.println("\tLuas Persegi Panjang : "+persegiPanjang.luas());

        //lingkaran
        Lingkaran lingkaran = new Lingkaran();

        bangungDatar.keliling();
        System.out.println("\tKeliling Lingkaran : "+lingkaran.keliling());
        bangungDatar.luas();
        System.out.println("\tLuas Lingkaran : "+lingkaran.luas());

    }
}
