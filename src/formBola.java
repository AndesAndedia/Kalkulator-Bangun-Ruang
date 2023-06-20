import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formBola {
    private JTextField fieldJari;
    private JTextField fieldLuas;
    private JTextField fieldVolume;
    private JButton hitungButton;
    private JButton kembaliButton;
    static JFrame frame = new JFrame();
    public static void main(String[] args) {
        JFrame frame = new JFrame("formBola");
        frame.setContentPane(new formBola().formBolas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel formBolas;
    public void showP(){

        frame.setContentPane(new formBola().formBolas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public formBola() {
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double jariJari;

                jariJari = Double.parseDouble(fieldJari.getText());

                Bola bola = new Bola(jariJari);
                bola.hitungLuasPermukaan();
                bola.hitungVolume();

                bola.tampilkanLuasPermukaan();
                bola.tampilkanVolume();

                fieldLuas.setText(String.valueOf(bola.luasPermukaan));
                fieldVolume.setText(String.valueOf(bola.volume));
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
