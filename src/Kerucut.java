public class Kerucut extends BangunRuang {
    private double jariJari;
    private double tinggi;

    public Kerucut(double jariJari, double tinggi) {
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
        double s = Math.sqrt(Math.pow(jariJari, 2) + Math.pow(tinggi, 2));
        return Math.PI * jariJari * (jariJari + s);
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;
    }
}