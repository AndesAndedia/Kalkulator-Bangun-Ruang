import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class formBola {
    private JTextField fieldJari;
    private JTextField fieldLuas;
    private JTextField fieldVolume;
    private JButton hitungButton;
    private JButton kembaliButton;
    static JFrame frame = new JFrame();
    private JPanel formBolas;
    private JPanel tittle;
    private JButton resetButton;
    private DecimalFormat decimalFormat;

    public static void main(String[] args) {
        JFrame frame = new JFrame("formBola");
        frame.setContentPane(new formBola().formBolas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void showP() {
        frame.setContentPane(new formBola().formBolas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public formBola() {
        decimalFormat = new DecimalFormat("#.###");

        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double jariJari;

                    jariJari = Double.parseDouble(fieldJari.getText());

                    Bola bola = new Bola(jariJari);
                    bola.hitungLuasPermukaan();
                    bola.hitungVolume();

                    fieldLuas.setText(decimalFormat.format(bola.luasPermukaan));
                    fieldVolume.setText(decimalFormat.format(bola.volume));
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
                fieldVolume.setText("");
                fieldLuas.setText("");
                fieldJari.requestFocus();
            }
        });
    }
}
