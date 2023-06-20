public class Tabung extends BangunRuang {
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double getJariJari() {
        return jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }

    @Override
    public double hitungVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }
}