package git.methodgearseb.xanadu.logiikka;

public class Ruutu {

    private final Vari ylempiVari;
    private final Vari alempiVari;

    public Ruutu(Vari vari1, Vari vari2) {
        this.ylempiVari = vari1;
        this.alempiVari = vari2;
    }

    public Vari getYlempiVari() {
        return ylempiVari;
    }

    public Vari getAlempiVari() {
        return alempiVari;
    }
    
    public boolean sisaltaaVarin(Vari vari) {
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

    @Override
    public String toString() {
        return ylempiVari + ", " + alempiVari;
    }
}
