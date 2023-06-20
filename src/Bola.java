public class Bola extends BangunRuang {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public void hitungLuasPermukaan() {
        luasPermukaan = 4 * Math.PI * Math.pow(jariJari, 2);
    }

    @Override
    public void hitungVolume() {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }
}