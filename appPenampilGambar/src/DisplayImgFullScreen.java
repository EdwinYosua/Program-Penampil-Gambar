import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayImgFullScreen extends JFrame{
    private JPanel btnPanel;
    private JButton btnGambar1;
    private JButton btnGambar2;
    private JButton btnGambar3;
    private JButton btnExit;
    private JPanel imgPanel;
    private JPanel mainPanel;

    public DisplayImgFullScreen() {
        setContentPane(mainPanel);
        setUndecorated(true);

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
