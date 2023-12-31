import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class formBalok {
    private DecimalFormat decimalFormat;

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
    private JPanel tittle;
    private JButton resetButton;

    public formBalok() {
        decimalFormat = new DecimalFormat("#.###");

        buttonHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exception Handling
                try {
                    double panjang, lebar, tinggi;

                    panjang = Double.parseDouble(fieldPanjang.getText());
                    lebar = Double.parseDouble(fieldLebar.getText());
                    tinggi = Double.parseDouble(fieldTinggi.getText());

                    Balok balok = new Balok(panjang, lebar, tinggi);
                    balok.hitungLuasPermukaan();
                    balok.hitungVolume();

                    fieldLuas.setText(decimalFormat.format(balok.luasPermukaan));
                    fieldVolume.setText(decimalFormat.format(balok.volume));
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
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldTinggi.setText("");
                fieldLebar.setText("");
                fieldPanjang.setText("");
                fieldVolume.setText("");
                fieldLuas.setText("");
                fieldPanjang.requestFocus();
            }
        });
    }

}
