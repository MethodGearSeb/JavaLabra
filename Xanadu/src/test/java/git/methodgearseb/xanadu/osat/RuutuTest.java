package git.methodgearseb.xanadu.osat;

import git.methodgearseb.xanadu.osat.Ruutu;
import java.awt.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RuutuTest {

    private Ruutu ruutu;

    public RuutuTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ruutu = new Ruutu(Color.BLUE, Color.RED);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void ruutuTallentaaOikeatVarit() {
        assertEquals(Color.BLUE, ruutu.getYlempiVari());
        assertEquals(Color.RED, ruutu.getAlempiVari());
    }
    
    @Test
    public void ruudutOvatSamatKunVaritOvatSamat() {
        assertEquals(ruutu, new Ruutu(Color.BLUE, Color.RED));
    }
    
    @Test
    public void ruudutOvatEriKunVaritOvatEri() {
        assertNotEquals(ruutu, new Ruutu(Color.BLACK, Color.BLACK));
    }
    
    @Test
    public void ruutuEiOleSamaKuinNull() {
        assertNotEquals(ruutu, null);
    }
    
    @Test
    public void ruutuEiOleSamaKuinEiRuutu() {
        assertNotEquals(ruutu, "ruutu");
    }
    
    @Test
    public void sisaltaaVarinPalauttaaTrueJosAnnettuVariOnYlempiVari() {
        assertEquals(true, ruutu.sisaltaaVarin(Color.BLUE));
    }
    
    @Test
    public void sisaltaaVarinPalauttaaTrueJosAnnettuVariOnAlempiVari() {
        assertEquals(true, ruutu.sisaltaaVarin(Color.RED));
    }
    
    @Test
    public void sisaltaaVarinPalauttaaFalseJosAnnettuVariEiLoydy() {
        assertEquals(false, ruutu.sisaltaaVarin(Color.BLACK));
    }
}
