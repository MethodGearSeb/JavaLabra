package git.methodgearseb.xanadu.liittyma;

import java.awt.*;
import javax.swing.*;
import javax.swing.colorchooser.AbstractColorChooserPanel;

public class LiittymaManual extends javax.swing.JFrame {

    private final JPanel a = new JPanel();

    public LiittymaManual() {
    }

    private void initComponents(final Container pane) {
        GridLayout layout = new GridLayout(0, 4);
        BorderLayout layout1 = new BorderLayout();
        Dimension dimension = new Dimension(800, 800);

        setMaximumSize(dimension);
        setMinimumSize(dimension);

        a.setLayout(layout);
        a.setSize(dimension);

        for (int i = 0; i < 16; i++) {
            JPanel p = new JPanel();
            JPanel a = new JPanel();
            JPanel b = new JPanel();
            p.setLayout(new GridLayout(0, 2));
            a.setBackground(Color.red);
            b.setBackground(Color.blue);
            p.add(a);
            p.add(b);
            pane.add(p);
        }
    }

    public void run() {
        LiittymaManual frame = new LiittymaManual();
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.initComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }
}
