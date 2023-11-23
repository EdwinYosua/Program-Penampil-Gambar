import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayImgWithButton extends JFrame {
    private JButton btnGambar1;
    private JButton btnGambar2;
    private JButton btnGambar3;
    private JButton btnExit;
    private JPanel imgPanel;
    private JPanel btnPanel;
    private JPanel mainPanel;

    public DisplayImgWithButton() {
        setContentPane(mainPanel);
        setMinimumSize(new Dimension(800, 1360));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);



        btnGambar1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showImage("0");
            }
        });

        btnGambar2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showImage("1");
            }
        });

        btnGambar3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showImage("2");
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void showImage(String cardName) {
        CardLayout cl = (CardLayout) (imgPanel.getLayout());
        cl.show(imgPanel,cardName);
    }

}
