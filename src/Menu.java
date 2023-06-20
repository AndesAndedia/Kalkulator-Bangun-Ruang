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
                    System.out.print("Masukkan panjang balok: ");
                    double panjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar balok: ");
                    double lebar = scanner.nextDouble();
                    System.out.print("Masukkan tinggi balok: ");
                    double tinggiBalok = scanner.nextDouble();

                    Balok balok = new Balok(panjang, lebar, tinggiBalok);
                    balok.hitungLuasPermukaan();
                    balok.hitungVolume();

                    System.out.println("=== Hasil Perhitungan Balok ===");
                    balok.tampilkanLuasPermukaan();
                    balok.tampilkanVolume();
                    konfirmasiLanjut();
                    break;

                case 2:
                    System.out.print("Masukkan sisi kotak: ");
                    double sisi = scanner.nextDouble();

                    Kotak kotak = new Kotak(sisi);
                    kotak.hitungLuasPermukaan();
                    kotak.hitungVolume();

                    System.out.println("=== Hasil Perhitungan Kotak ===");
                    kotak.tampilkanLuasPermukaan();
                    kotak.tampilkanVolume();
                    konfirmasiLanjut();
                    break;

                case 3:
                    System.out.print("Masukkan jari-jari tabung: ");
                    double jariJariTabung = scanner.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    double tinggiTabung = scanner.nextDouble();

                    Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
                    tabung.hitungLuasPermukaan();
                    tabung.hitungVolume();

                    System.out.println("=== Hasil Perhitungan Tabung ===");
                    tabung.tampilkanLuasPermukaan();
                    tabung.tampilkanVolume();
                    konfirmasiLanjut();
                    break;

                case 4:
                    System.out.print("Masukkan jari-jari kerucut: ");
                    double jariJariKerucut = scanner.nextDouble();
                    System.out.print("Masukkan tinggi kerucut: ");
                    double tinggiKerucut = scanner.nextDouble();

                    Kerucut kerucut = new Kerucut(jariJariKerucut, tinggiKerucut);
                    kerucut.hitungLuasPermukaan();
                    kerucut.hitungVolume();

                    System.out.println("=== Hasil Perhitungan Kerucut ===");
                    kerucut.tampilkanLuasPermukaan();
                    kerucut.tampilkanVolume();
                    konfirmasiLanjut();
                    break;

                case 5:
                    System.out.print("Masukkan jari-jari bola: ");
                    double jariJariBola = scanner.nextDouble();

                    Bola bola = new Bola(jariJariBola);
                    bola.hitungLuasPermukaan();
                    bola.hitungVolume();

                    System.out.println("=== Hasil Perhitungan Bola ===");
                    bola.tampilkanLuasPermukaan();
                    bola.tampilkanVolume();
                    konfirmasiLanjut();
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
    private void konfirmasiLanjut() {
        System.out.print("Apakah Anda ingin menghitung bangun ruang lainnya? (ya/tidak) ");
        String konfirmasi = scanner.next();

        if (konfirmasi.equalsIgnoreCase("ya")) {
            tampilkanMenu();
        } else {
            System.out.println("Terima kasih telah menggunakan aplikasi ini!");
            exit(0);
        }
    }
}
