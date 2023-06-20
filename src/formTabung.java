import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formTabung {
    private JTextField fieldJari;
    private JTextField fieldTinggi;
    private JTextField fieldLuas;
    private JTextField fieldVolume;
    private JButton hitungButton;
    private JButton button2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("formTabung");
        frame.setContentPane(new formTabung().formTabungs);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel formTabungs;

    public formTabung() {
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double jariJari, tinggi;

                jariJari = Double.parseDouble(fieldJari.getText());
                tinggi = Double.parseDouble(fieldTinggi.getText());

                Tabung tabung = new Tabung(jariJari, tinggi);
                tabung.hitungLuasPermukaan();
                tabung.hitungVolume();

                tabung.tampilkanLuasPermukaan();
                tabung.tampilkanVolume();

                fieldLuas.setText(String.valueOf(tabung.luasPermukaan));
                fieldVolume.setText(String.valueOf(tabung.volume));
            }
        });
    }
}
