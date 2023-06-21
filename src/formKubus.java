import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formKubus {
    private JTextField fieldSisi;
    private JTextField fieldLuas;
    private JButton hitungButton;
    private JButton kembaliButton;
    private JTextField fieldVolume;
    static JFrame frame = new JFrame();

    public static void main(String[] args) {
        JFrame frame = new JFrame("formKubus");
        frame.setContentPane(new formKubus().formKubuss);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel formKubuss;
    private JPanel tittle;

    public formKubus() {
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double sisi;

                    sisi = Double.parseDouble(fieldSisi.getText());

                    Kubus kubus = new Kubus(sisi);
                    kubus.hitungLuasPermukaan();
                    kubus.hitungVolume();

                    kubus.tampilkanLuasPermukaan();
                    kubus.tampilkanVolume();

                    fieldLuas.setText(String.valueOf(kubus.luasPermukaan));
                    fieldVolume.setText(String.valueOf(kubus.volume));
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

        frame.setContentPane(new formKubus().formKubuss);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
