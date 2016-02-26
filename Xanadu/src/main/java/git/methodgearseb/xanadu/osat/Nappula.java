package git.methodgearseb.xanadu.osat;

import java.awt.Color;

public class Nappula {
    
    private final Color vari;
    private Ruutu ruutu;

    public Nappula(Color vari) {
        this.vari = vari;
    }

    public Color getVari() {
        return vari;
    }

    public Ruutu getRuutu() {
        return ruutu;
    }

    public void setRuutu(Ruutu ruutu) {
        this.ruutu = ruutu;
    }
}
