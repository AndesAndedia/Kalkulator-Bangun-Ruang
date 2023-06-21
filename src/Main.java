import javax.swing.*;
abstract class BangunRuang {
    protected double luasPermukaan;
    protected double volume;

    public abstract void hitungLuasPermukaan();

    public abstract void hitungVolume();

    public void tampilkanLuasPermukaan() {
        System.out.println("Luas Permukaan: " + luasPermukaan);
    }

    public void tampilkanVolume() {
        System.out.println("Volume: " + volume);
    }
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