package git.methodgearseb.xanadu.osat;

import git.methodgearseb.xanadu.tyokalut.Vari;

public class Nappula {
    
    private final Vari vari;
    private Ruutu ruutu;

    public Nappula(Vari vari) {
        this.vari = vari;
    }

    public Vari getVari() {
        return vari;
    }

    public Ruutu getRuutu() {
        return ruutu;
    }

    public void setRuutu(Ruutu ruutu) {
        this.ruutu = ruutu;
    }
}
