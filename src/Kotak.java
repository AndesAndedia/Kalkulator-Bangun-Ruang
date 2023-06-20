public class Kotak extends BangunRuang {
    private double sisi;

    public Kotak(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }

    @Override
    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }
}