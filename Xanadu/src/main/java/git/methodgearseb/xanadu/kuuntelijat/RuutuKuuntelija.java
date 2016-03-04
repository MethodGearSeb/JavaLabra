package git.methodgearseb.xanadu.kuuntelijat;

import git.methodgearseb.xanadu.liittyma.Liittyma;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class RuutuKuuntelija implements MouseListener {

    private final Liittyma kuulija; 

    public RuutuKuuntelija(Liittyma kuulija) {
        this.kuulija = kuulija;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        kuulija.paintComponents(kuulija.getGraphics());
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

    @Override
    public void mousePressed(MouseEvent me) {
    }
}
