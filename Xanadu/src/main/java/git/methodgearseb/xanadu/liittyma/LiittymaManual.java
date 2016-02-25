package git.methodgearseb.xanadu.liittyma;

import git.methodgearseb.xanadu.osat.*;
import java.awt.*;
import javax.swing.*;

public class LiittymaManual extends javax.swing.JFrame {

    private final JPanel a = new JPanel();

    public LiittymaManual() {
    }

    private void initComponents(final Container pane, Pelialue alue) {
        GridLayout layout = new GridLayout(4, 4);
        BorderLayout layout1 = new BorderLayout();
        Dimension dimension = new Dimension(860, 860);
        
        layout.setHgap(20);
        layout.setVgap(20);
        layout1.setHgap(20);
        layout1.setVgap(20);

        setMaximumSize(dimension);
        setMinimumSize(dimension);

        a.setLayout(layout);
        a.setSize(dimension);

        java.util.List<Ruutu> ruudut = alue.getRuudut();

        for (int i = 0; i < ruudut.size(); i++) {
            Ruutu ruutu = ruudut.get(i);
            JPanel p = new JPanel();
            JPanel top = new JPanel();
            JPanel bottom = new JPanel();
            Dimension panelDimension = new Dimension(200, 200);

            p.setLayout(new GridLayout(2, 1));
            p.setSize(panelDimension);
            top.setBackground(ruutu.getYlempiVari());
            bottom.setBackground(ruutu.getAlempiVari());
            p.add(top);
            p.add(bottom);
            a.add(p);
        }

        pane.add(a);
    }

    public void run() {
        LiittymaManual frame = new LiittymaManual();
        Pelialue pelialue = new Pelialue();
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.initComponents(frame.getContentPane(), pelialue);
        frame.pack();
        frame.setVisible(true);
    }
}
