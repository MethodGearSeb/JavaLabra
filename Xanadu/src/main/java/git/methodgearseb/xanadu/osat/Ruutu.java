package git.methodgearseb.xanadu.osat;

import java.awt.Color;

public class Ruutu {

    private final Color ylempiVari;
    private final Color alempiVari;
    private Nappula nappula;

    public Ruutu(Color vari1, Color vari2) {
        this.ylempiVari = vari1;
        this.alempiVari = vari2;
        this.nappula = null;
    }

    public Color getYlempiVari() {
        return ylempiVari;
    }

    public Color getAlempiVari() {
        return alempiVari;
    }

    public Nappula getNappula() {
        return nappula;
    }

    public void setNappula(Nappula nappula) {
        this.nappula = nappula;
    }

    public boolean sisaltaaVarin(Color vari) {
        return ylempiVari == vari || alempiVari == vari;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != getClass()) {
            return false;
        }

        Ruutu ruutu = (Ruutu) obj;

        return ruutu.hashCode() == hashCode();
    }

    @Override
    public int hashCode() {
        int luku1 = 0, luku2 = 0;
        String ylempiString = String.valueOf(ylempiVari);
        String alempiString = String.valueOf(alempiVari);

        for (char c : ylempiString.toCharArray()) {
            luku1 += Character.valueOf(c);
        }

        for (char c : alempiString.toCharArray()) {
            luku2 += Character.valueOf(c);
        }

        return luku1 * luku2;
    }
}
