import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formKotak {
    private JTextField fieldSisi;
    private JTextField fieldLuas;
    private JButton hitungButton;
    private JButton kembaliButton;
    private JTextField fieldVolume;
    static JFrame frame = new JFrame();

    public static void main(String[] args) {
        JFrame frame = new JFrame("formKotak");
        frame.setContentPane(new formKotak().formKotaks);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel formKotaks;

    public formKotak() {
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double sisi;

                    sisi = Double.parseDouble(fieldSisi.getText());

                    Kotak kotak = new Kotak(sisi);
                    kotak.hitungLuasPermukaan();
                    kotak.hitungVolume();

                    kotak.tampilkanLuasPermukaan();
                    kotak.tampilkanVolume();

                    fieldLuas.setText(String.valueOf(kotak.luasPermukaan));
                    fieldVolume.setText(String.valueOf(kotak.volume));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Input tidak valid! Pastikan input adalah angka.");
                }
            }
        });
        kembaliButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                mainMenu f = new mainMenu();
                f.showP();
            }
        });
    }

    public void showP() {

        frame.setContentPane(new formKotak().formKotaks);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
