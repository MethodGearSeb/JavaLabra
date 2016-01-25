package git.methodgearseb.xanadu.logiikka;

import java.util.*;

public class Pelialue {
    
    List<Ruutu> ruudut;

    public Pelialue() {
        ruudut = new ArrayList<>();
        
        for (int i = 0; i < 16; i++) {
            Ruutu ruutu = new Ruutu(Vari.BEIGE, Vari.BEIGE);
            
            ruudut.add(ruutu);
        }
    }

    public List<Ruutu> getRuudut() {
        return ruudut;
    }
}
