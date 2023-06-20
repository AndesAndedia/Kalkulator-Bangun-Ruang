import java.util.Scanner;

import static java.lang.System.exit;

public class Menu {
    private Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void tampilkanMenu() {
        int pilihan;
        do {
            System.out.println("=== APLIKASI MENGHITUNG BANGUN RUANG ===");
            System.out.println("Pilih bangun ruang yang ingin dihitung:");
            System.out.println("1. Balok");
            System.out.println("2. Kotak");
            System.out.println("3. Tabung");
            System.out.println("4. Kerucut");
            System.out.println("5. Bola");
            System.out.println("0. Keluar");

            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    hitungBalok();
                    break;

                case 2:
                    hitungKotak();
                    break;

                case 3:
                    hitungTabung();
                    break;

                case 4:
                    hitungKerucut();
                    break;

                case 5:
                    hitungBola();
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini!");
                    exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }

            System.out.println();
        } while (pilihan != 0);
    }

    private void hitungBalok() {
        System.out.print("Masukkan panjang balok: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebar = scanner.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggi = scanner.nextDouble();

        Balok balok = new Balok(panjang, lebar, tinggi);
        balok.hitungLuasPermukaan();
        balok.hitungVolume();

        System.out.println("=== Hasil Perhitungan Balok ===");
        balok.tampilkanLuasPermukaan();
        balok.tampilkanVolume();
        konfirmasiLanjut();
    }

    private void hitungKotak() {
        System.out.print("Masukkan sisi kotak: ");
        double sisi = scanner.nextDouble();

        Kotak kotak = new Kotak(sisi);
        kotak.hitungLuasPermukaan();
        kotak.hitungVolume();

        System.out.println("=== Hasil Perhitungan Kotak ===");
        kotak.tampilkanLuasPermukaan();
        kotak.tampilkanVolume();
        konfirmasiLanjut();
    }

    private void hitungTabung() {
        System.out.print("Masukkan jari-jari tabung: ");
        double jariJari = scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = scanner.nextDouble();

        Tabung tabung = new Tabung(jariJari, tinggi);
        tabung.hitungLuasPermukaan();
        tabung.hitungVolume();

        System.out.println("=== Hasil Perhitungan Tabung ===");
        tabung.tampilkanLuasPermukaan();
        tabung.tampilkanVolume();
        konfirmasiLanjut();
    }

    private void hitungKerucut() {
        System.out.print("Masukkan jari-jari kerucut: ");
        double jariJari = scanner.nextDouble();
        System.out.print("Masukkan tinggi kerucut: ");
        double tinggi = scanner.nextDouble();

        Kerucut kerucut = new Kerucut(jariJari, tinggi);
        kerucut.hitungLuasPermukaan();
        kerucut.hitungVolume();

        System.out.println("=== Hasil Perhitungan Kerucut ===");
        kerucut.tampilkanLuasPermukaan();
        kerucut.tampilkanVolume();
        konfirmasiLanjut();
    }

    private void hitungBola() {
        System.out.print("Masukkan jari-jari bola: ");
        double jariJari = scanner.nextDouble();

        Bola bola = new Bola(jariJari);
        bola.hitungLuasPermukaan();
        bola.hitungVolume();

        System.out.println("=== Hasil Perhitungan Bola ===");
        bola.tampilkanLuasPermukaan();
        bola.tampilkanVolume();
        konfirmasiLanjut();
    }

    private void konfirmasiLanjut() {
        System.out.print("Apakah Anda ingin menghitung bangun ruang yang sama lagi? (ya/tidak) ");
        String konfirmasi = scanner.next();

        if (konfirmasi.equalsIgnoreCase("ya")) {
            System.out.println();
        } else {
            System.out.println("Terima kasih telah menggunakan aplikasi ini!");
            exit(0);
        }
    }
}