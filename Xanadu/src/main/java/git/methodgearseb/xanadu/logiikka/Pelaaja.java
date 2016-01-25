package git.methodgearseb.xanadu.logiikka;

import java.util.*;

public class Pelaaja {

    List<Nappula> nappulat;

    public Pelaaja(Vari vari) {
        nappulat = new ArrayList<>();
        
        for (int i = 0; i < 8; i++) {
            Nappula nappula = new Nappula(vari);
            
            nappulat.add(nappula);
        }
    }

    public List<Nappula> getNappulat() {
        return nappulat;
    }
}
