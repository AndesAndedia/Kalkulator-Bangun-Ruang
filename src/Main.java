import javax.swing.*;
abstract class BangunRuang {
    protected double luasPermukaan;
    protected double volume;

    public abstract void hitungLuasPermukaan();

    public abstract void hitungVolume();

}

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                mainMenu menu = new mainMenu();
                menu.showP();
            }
        });
    }
}