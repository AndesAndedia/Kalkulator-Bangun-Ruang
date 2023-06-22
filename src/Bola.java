public class Bola extends BangunRuang {
    // Enkapsulasi
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    // Method Overriding (Polimorfisme Dinamis)
    @Override
    public void hitungLuasPermukaan() {
        luasPermukaan = 4 * Math.PI * Math.pow(jariJari, 2);
    }

    @Override
    public void hitungVolume() {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }
}