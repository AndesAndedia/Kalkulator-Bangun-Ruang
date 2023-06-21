import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainMenu {
    private JButton balokButton;
    private JButton bolaButton;
    private JButton kerucutButton;
    private JButton kubusButton;
    private JButton tabungButton;
    private JButton exitButton;
    static JFrame frame = new JFrame();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                showMainMenu();
            }
        });
    }

    private JPanel mainP;
    private JPanel tittle;
    private JLabel bolaIMG;

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

        tabungButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                formTabung f = new formTabung();
                f.showP();
            }
        });
        kubusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                formKubus f = new formKubus();
                f.showP();
            }
        });
    }

    public static void showMainMenu() {
        mainMenu menu = new mainMenu();
        frame.setContentPane(menu.mainP);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void showP() {
        frame.setContentPane(mainP);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
