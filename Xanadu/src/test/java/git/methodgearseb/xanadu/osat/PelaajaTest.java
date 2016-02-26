package git.methodgearseb.xanadu.osat;

import git.methodgearseb.xanadu.osat.Pelaaja;
import java.awt.Color;
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
        pelaaja = new Pelaaja(Color.BLACK);
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
        assertEquals(Color.BLACK, pelaaja.getNappulat().get(0).getVari());
    }
    
    @Test
    public void nappulatOvatValkoisia() {
        pelaaja = new Pelaaja(Color.WHITE);
        
        assertEquals(Color.WHITE, pelaaja.getNappulat().get(0).getVari());
    }
}
