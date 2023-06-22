public class Balok extends BangunRuang {
    // Enkapsulasi
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Method Overriding (Polimorfisme Dinamis)
    @Override
    public void hitungLuasPermukaan() {
        luasPermukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    @Override
    public void hitungVolume() {
        volume = panjang * lebar * tinggi;
    }
}