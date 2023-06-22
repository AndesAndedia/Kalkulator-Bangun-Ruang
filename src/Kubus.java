public class Kubus extends BangunRuang {
    // Enkapsulasi
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    // Method Overriding (Polimorfisme Dinamis)
    @Override
    public void hitungLuasPermukaan() {
        luasPermukaan = 6 * Math.pow(sisi, 2);
    }

    @Override
    public void hitungVolume() {
        volume = Math.pow(sisi, 3);
    }
}