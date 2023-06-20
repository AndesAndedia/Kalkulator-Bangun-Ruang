import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainMenu {
    private JButton balokButton;
    private JButton bolaButton;
    private JButton kerucutButton;
    private JButton kotakButton;
    private JButton tabungButton;
    private JButton exitButton;
    static JFrame frame = new JFrame();

    public static void main(String[] args) {

        frame.setContentPane(new mainMenu().mainP);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel mainP;

    public mainMenu() {
    balokButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        frame.setVisible(false);
        formBalok f = new formBalok();
        f.showP();
        }
    });
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        bolaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                formBola f = new formBola();
                f.showP();
            }
        });
        kerucutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                formKerucut f = new formKerucut();
                f.showP();
            }
        });
        kotakButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                formKotak f = new formKotak();
                f.showP();
            }
        });
        tabungButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                formTabung f = new formTabung();
                f.showP();
            }
        });
    }
public void showP(){

    frame.setContentPane(new mainMenu().mainP);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
}
}
