public class Tabung extends BangunRuang {
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public void hitungLuasPermukaan() {
        luasPermukaan = 2 * Math.PI * jariJari * (jariJari + tinggi);
    }

    @Override
    public void hitungVolume() {
        volume = Math.PI * Math.pow(jariJari, 2) * tinggi;
    }
}