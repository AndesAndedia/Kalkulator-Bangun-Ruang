import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formBalok {
    private JTextField fieldPanjang;
    private JTextField fieldLebar;
    private JTextField fieldTinggi;
    private JTextField fieldLuas;
    private JButton buttonHitung;
    private JButton buttonKembali;

    public static void main(String[] args) {
        JFrame frame = new JFrame("formBalok");
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
        }
    });
}

}