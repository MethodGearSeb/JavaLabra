package git.methodgearseb.xanadu.liittyma;

import git.methodgearseb.xanadu.osat.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.*;

public class Liittyma extends JFrame implements MouseListener {

    private final HashMap<JPanel, Ruutu> paneeliRuutuKartta;
    private final HashMap<Ruutu, Boolean> sallitut;
    private final JLabel label;
    private JPanel valittu;

    public Liittyma() {
        this.paneeliRuutuKartta = new HashMap<>();
        this.sallitut = new HashMap<>();
        this.label = new JLabel();

        Dimension dimension = new Dimension(430, 50);

        this.label.setMinimumSize(dimension);
        this.label.setMaximumSize(dimension);
    }

    private void initComponents(final Container pane, Pelialue alue) {
        GridLayout layout = new GridLayout(4, 4);
        BorderLayout layout1 = new BorderLayout();
        Dimension aDimension = new Dimension(430, 430);
        Dimension paneDimension = new Dimension(500, 600);
        JPanel a = new JPanel();

        layout.setHgap(10);
        layout.setVgap(10);
        layout1.setHgap(20);
        layout1.setVgap(20);

        setMinimumSize(paneDimension);

        a.setLayout(layout);
        a.setMinimumSize(aDimension);
        a.setMaximumSize(aDimension);

        ArrayList<Ruutu> ruudut = alue.getRuudut();

        for (int i = 0; i < ruudut.size(); i++) {
            Ruutu ruutu = ruudut.get(i);
            JPanel p = new JPanel();
            JPanel top = new JPanel();
            JPanel bottom = new JPanel();
            Dimension panelDimension = new Dimension(100, 100);

            p.setLayout(new GridLayout(2, 1));
            p.setMaximumSize(panelDimension);
            top.setBackground(ruutu.getYlempiVari());
            bottom.setBackground(ruutu.getAlempiVari());
            p.add(top);
            p.add(bottom);
            p.addMouseListener(this);
            paneeliRuutuKartta.put(p, ruutu);
            a.add(p);
        }

        pane.setLayout(new BoxLayout(pane, WIDTH));

        JPanel panel = new JPanel();
        JLabel varoitus = new JLabel("Varoitus: ikkunan koon säätely haittaa pelin toimintaa");

        panel.setMaximumSize(new Dimension(430, 100));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);
        panel.add(varoitus);
        
        pane.add(a);
        pane.add(panel);
    }

    @Override
    public void paintComponents(Graphics g) {
        int x = valittu.getX();
        int y = valittu.getY();
        int leveys = valittu.getWidth();
        int korkeus = valittu.getHeight();
        g = getGraphics();
        g.setColor(java.awt.Color.WHITE);
        g.fillOval(x + (leveys / 4) + 40, y + (korkeus / 2), leveys / 2, korkeus / 2);
        valittu.setMaximumSize(new Dimension(10, 10));
    }

    public void run() {
        Liittyma frame = new Liittyma();
        Pelialue pelialue = new Pelialue();
        Pelaaja pelaaja1 = new Pelaaja(Color.white);
        
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.initComponents(frame.getContentPane(), pelialue);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        valittu = (JPanel) me.getSource();
        label.setText(paneeliRuutuKartta.get(valittu).getYlempiVari().toString());
        this.paintComponents(this.getGraphics());
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
}
