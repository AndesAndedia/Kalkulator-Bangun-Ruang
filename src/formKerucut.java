import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formKerucut {
    private JTextField fieldJari;
    private JTextField fieldTinggi;
    private JTextField fieldLuas;
    private JTextField fieldVolume;
    private JButton button1;
    private JButton button2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("formKerucut");
        frame.setContentPane(new formKerucut().formKerucuts);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel formKerucuts;

    public formKerucut() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
            }
        });
    }
}
