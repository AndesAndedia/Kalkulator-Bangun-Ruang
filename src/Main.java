abstract class BangunRuang {
    public abstract double hitungLuasPermukaan();
    public abstract double hitungVolume();
}

public class Main {
    public static void main(String[] args) {
        Balok balok = new Balok(5, 4, 3);
        Kotak kotak = new Kotak(5);
        Tabung tabung = new Tabung(3, 7);
        Kerucut kerucut = new Kerucut(4, 6);
        Bola bola = new Bola(5);

        // Menghitung luas permukaan
        double luasPermukaan1 = balok.hitungLuasPermukaan();
        double luasPermukaan2 = kotak.hitungLuasPermukaan();
        double luasPermukaan3 = tabung.hitungLuasPermukaan();
        double luasPermukaan4 = kerucut.hitungLuasPermukaan();
        double luasPermukaan5 = bola.hitungLuasPermukaan();

        // Menghitung volume
        double volume1 = balok.hitungVolume();
        double volume2 = kotak.hitungVolume();
        double volume3 = tabung.hitungVolume();
        double volume4 = kerucut.hitungVolume();
        double volume5 = bola.hitungVolume();

        // Menampilkan hasil
        System.out.println("Luas Permukaan Balok: " + luasPermukaan1);
        System.out.println("Luas Permukaan Kotak: " + luasPermukaan2);
        System.out.println("Luas Permukaan Tabung: " + luasPermukaan3);
        System.out.println("Luas Permukaan Kerucut: " + luasPermukaan4);
        System.out.println("Luas Permukaan Bola: " + luasPermukaan5);
        System.out.println("Volume Balok: " + volume1);
        System.out.println("Volume Kotak: " + volume2);
        System.out.println("Volume Tabung: " + volume3);
        System.out.println("Volume Kerucut: " + volume4);
        System.out.println("Volume Bola: " + volume5);
    }
}