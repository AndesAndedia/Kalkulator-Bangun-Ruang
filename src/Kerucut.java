public class Kerucut extends BangunRuang {
    // Enkapsulasi
    private double jariJari;
    private double tinggi;

    public Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    // Method Overriding (Polimorfisme Dinamis)
    @Override
    public void hitungLuasPermukaan() {
        luasPermukaan = Math.PI * jariJari * (jariJari + Math.sqrt(Math.pow(tinggi, 2) + Math.pow(jariJari, 2)));
    }

    @Override
    public void hitungVolume() {
        volume = (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;
    }
}