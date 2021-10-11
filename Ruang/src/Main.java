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

        System.out.println();
        System.out.println("Menghitung Objek 3D");
        BangunRuang bangunRuang = new BangunRuang();

        //balok
        Balok balok = new Balok();

        bangunRuang.volume();
        System.out.println("\tVolume Balok : "+balok.volume());
        bangunRuang.luasPermukaan();
        System.out.println("\tLuas Permukaan Balok : "+balok.luasPermukaan());

        //kubus
        Kubus kubus = new Kubus();

        bangunRuang.volume();
        System.out.println("\tVolume Kubus : "+kubus.volume());
        bangunRuang.luasPermukaan();
        System.out.println("\tLuas Permukaan Kubus : "+kubus.luasPermukaan());
        
        //tabung
        Tabung tabung = new Tabung();
        bangunRuang.volume();
        System.out.println("\tVolume Tabung : "+ tabung.volume());
        bangunRuang.luasPermukaan();
        System.out.println("\tLuas Permukaan Tabung : "+ tabung.luasPermukaan());
        
        //prisma
        Prisma prisma = new Prisma();
        bangunRuang.volume();
        System.out.println("\tVolume Prisma : "+ prisma.volume());
        bangunRuang.luasPermukaan();
        System.out.println("\tLuas Permukaan Prisma : "+ prisma.luasPermukaan());

    }
}
