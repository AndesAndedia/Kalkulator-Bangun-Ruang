import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class formTabung {
    private JTextField fieldJari;
    private JTextField fieldTinggi;
    private JTextField fieldLuas;
    private JTextField fieldVolume;
    private JButton hitungButton;
    private JButton kembaliButton;
    static JFrame frame = new JFrame();
    private JPanel formTabungs;
    private JPanel tittle;
    private JButton resetButton;
    private DecimalFormat decimalFormat;

    public static void main(String[] args) {
        JFrame frame = new JFrame("formTabung");
        frame.setContentPane(new formTabung().formTabungs);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void showP() {
        frame.setContentPane(new formTabung().formTabungs);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public formTabung() {
        decimalFormat = new DecimalFormat("#.###");

        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double jariJari, tinggi;

                    jariJari = Double.parseDouble(fieldJari.getText());
                    tinggi = Double.parseDouble(fieldTinggi.getText());

                    Tabung tabung = new Tabung(jariJari, tinggi);
                    tabung.hitungLuasPermukaan();
                    tabung.hitungVolume();

                    fieldLuas.setText(decimalFormat.format(tabung.luasPermukaan));
                    fieldVolume.setText(decimalFormat.format(tabung.volume));
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
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldJari.setText("");
                fieldTinggi.setText("");
                fieldVolume.setText("");
                fieldLuas.setText("");
                fieldJari.requestFocus();
            }
        });
    }
}
