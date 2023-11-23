import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayImgComboBox extends JFrame {
    private JButton btnExit;
    private JPanel imgPanel;
    private JPanel mainPanel;
    private JComboBox cbxOptImg;

    public DisplayImgComboBox() {

        setContentPane(mainPanel);
        setMinimumSize(new Dimension(800, 1360));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        cbxOptImg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (imgPanel.getLayout());
                cl.show(imgPanel, String.valueOf(cbxOptImg.getSelectedIndex()));
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
