import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formKerucut {
    private JTextField fieldJari;
    private JTextField fieldTinggi;
    private JTextField fieldLuas;
    private JTextField fieldVolume;
    private JButton buttonHitung;
    private JButton kembaliButton;
    static JFrame frame = new JFrame();
    public static void main(String[] args) {
        JFrame frame = new JFrame("formKerucut");
        frame.setContentPane(new formKerucut().formKerucuts);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel formKerucuts;
    private JPanel tittle;

    public formKerucut() {
        buttonHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double jariJari, tinggi;

                    jariJari = Double.parseDouble(fieldJari.getText());
                    tinggi = Double.parseDouble(fieldTinggi.getText());

                    Kerucut kerucut = new Kerucut(jariJari, tinggi);
                    kerucut.hitungLuasPermukaan();
                    kerucut.hitungVolume();

                    kerucut.tampilkanLuasPermukaan();
                    kerucut.tampilkanVolume();

                    fieldLuas.setText(String.valueOf(kerucut.luasPermukaan));
                    fieldVolume.setText(String.valueOf(kerucut.volume));
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
    public void showP(){

        frame.setContentPane(new formKerucut().formKerucuts);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
