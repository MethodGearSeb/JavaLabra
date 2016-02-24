package git.methodgearseb.xanadu.osat;

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
