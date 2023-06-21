import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formBalok {
    private JTextField fieldPanjang;
    private JTextField fieldLebar;
    private JTextField fieldTinggi;
    private JTextField fieldLuas;
    private JButton buttonHitung;
    private JButton kembaliButton;
    static JFrame frame = new JFrame();

    public static void main(String[] args) {

        frame.setContentPane(new formBalok().formBaloks);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void showP() {

        frame.setContentPane(new formBalok().formBaloks);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel formBaloks;
    private JTextField fieldVolume;
    private JLabel labelVolume;

    public formBalok() {
        buttonHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double panjang, lebar, tinggi;

                    panjang = Double.parseDouble(fieldPanjang.getText());
                    lebar = Double.parseDouble(fieldLebar.getText());
                    tinggi = Double.parseDouble(fieldTinggi.getText());

                    Balok balok = new Balok(panjang, lebar, tinggi);
                    balok.hitungLuasPermukaan();
                    balok.hitungVolume();

                    balok.tampilkanLuasPermukaan();
                    balok.tampilkanVolume();

                    fieldLuas.setText(String.valueOf(balok.luasPermukaan));
                    fieldVolume.setText(String.valueOf(balok.volume));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Input tidak valid! Pastikan semua input adalah angka.");
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

}
