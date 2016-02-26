package git.methodgearseb.xanadu.kuuntelijat;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

public class RuutuKuuntelija extends MouseAdapter {
    
    private final Graphics2D g;

    public RuutuKuuntelija(Graphics2D g) {
        this.g = g;
    }

    public void actionPerformed(ActionEvent e) {
        Ellipse2D nappula = new Ellipse2D.Double(10, 10, 80, 80);
        g.setColor(Color.WHITE);
        g.fill(nappula);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Ellipse2D nappula = new Ellipse2D.Double(10, 10, 80, 80);
        g.setColor(Color.WHITE);
        g.fill(nappula);
    }
}
