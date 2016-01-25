package git.methodgearseb.xanadu.logiikka;

public class Nappula {
    
    private Vari vari;
    private Ruutu ruutu;

    public Nappula(Vari vari) {
        if (vari == Vari.VALKOINEN || vari == Vari.MUSTA) {
            this.vari = vari;
        }
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
