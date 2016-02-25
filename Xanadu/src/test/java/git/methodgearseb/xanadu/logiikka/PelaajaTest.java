package git.methodgearseb.xanadu.logiikka;

import git.methodgearseb.xanadu.tyokalut.Vari;
import git.methodgearseb.xanadu.osat.Pelaaja;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PelaajaTest {
    
    private Pelaaja pelaaja;
    
    public PelaajaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pelaaja = new Pelaaja(Vari.MUSTA);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void pelaajallaOnKahdeksanNappulaa() {
        assertEquals(8, pelaaja.getNappulat().size());
    }
    
    @Test
    public void nappulatOvatMustia() {
        assertEquals(Vari.MUSTA, pelaaja.getNappulat().get(0).getVari());
    }
    
    @Test
    public void nappulatOvatValkoisia() {
        pelaaja = new Pelaaja(Vari.VALKOINEN);
        
        assertEquals(Vari.VALKOINEN, pelaaja.getNappulat().get(0).getVari());
    }
    
    @Test
    public void nappulatEivatOleBeigeja() {
        pelaaja = new Pelaaja(Vari.BEIGE);
        
        assertNotEquals(Vari.BEIGE, pelaaja.getNappulat().get(0).getVari());
    }
}
