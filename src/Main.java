import javax.swing.*;
import java.util.Scanner;
abstract class BangunRuang {
    protected double luasPermukaan;
    protected double volume;

    public abstract void hitungLuasPermukaan();

    public abstract void hitungVolume();

    public void tampilkanLuasPermukaan() {
        System.out.println("Luas Permukaan: " + luasPermukaan);
//        JOptionPane.showMessageDialog(null, luasPermukaan);
    }

    public void tampilkanVolume() {
        System.out.println("Volume: " + volume);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);

        menu.tampilkanMenu();
    }
}