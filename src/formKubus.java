import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class formKubus {
    private JTextField fieldSisi;
    private JTextField fieldLuas;
    private JButton hitungButton;
    private JButton kembaliButton;
    private JTextField fieldVolume;
    static JFrame frame = new JFrame();
    private JPanel formKubuss;
    private JPanel tittle;
    private JButton resetButton;
    private DecimalFormat decimalFormat;

    public static void main(String[] args) {
        JFrame frame = new JFrame("formKubus");
        frame.setContentPane(new formKubus().formKubuss);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void showP() {
        frame.setContentPane(new formKubus().formKubuss);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public formKubus() {
        decimalFormat = new DecimalFormat("#.###");

        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exception Handling
                try {
                    double sisi;

                    sisi = Double.parseDouble(fieldSisi.getText());

                    Kubus kubus = new Kubus(sisi);
                    kubus.hitungLuasPermukaan();
                    kubus.hitungVolume();

                    fieldLuas.setText(decimalFormat.format(kubus.luasPermukaan));
                    fieldVolume.setText(decimalFormat.format(kubus.volume));
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
                fieldSisi.setText("");
                fieldVolume.setText("");
                fieldLuas.setText("");
                fieldSisi.requestFocus();
            }
        });
    }
}
