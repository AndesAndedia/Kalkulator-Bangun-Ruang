import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class formKerucut {
    private JTextField fieldJari;
    private JTextField fieldTinggi;
    private JTextField fieldLuas;
    private JTextField fieldVolume;
    private JButton buttonHitung;
    private JButton kembaliButton;
    static JFrame frame = new JFrame();
    private JPanel formKerucuts;
    private JPanel tittle;
    private JButton resetButton;
    private DecimalFormat decimalFormat;

    public static void main(String[] args) {
        JFrame frame = new JFrame("formKerucut");
        frame.setContentPane(new formKerucut().formKerucuts);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void showP() {
        frame.setContentPane(new formKerucut().formKerucuts);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public formKerucut() {
        decimalFormat = new DecimalFormat("#.###");

        buttonHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exception Handling
                try {
                    double jariJari, tinggi;

                    jariJari = Double.parseDouble(fieldJari.getText());
                    tinggi = Double.parseDouble(fieldTinggi.getText());

                    Kerucut kerucut = new Kerucut(jariJari, tinggi);
                    kerucut.hitungLuasPermukaan();
                    kerucut.hitungVolume();

                    fieldLuas.setText(decimalFormat.format(kerucut.luasPermukaan));
                    fieldVolume.setText(decimalFormat.format(kerucut.volume));
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
                fieldTinggi.setText("");
                fieldJari.setText("");
                fieldVolume.setText("");
                fieldLuas.setText("");
                fieldJari.requestFocus();
            }
        });
    }
}
