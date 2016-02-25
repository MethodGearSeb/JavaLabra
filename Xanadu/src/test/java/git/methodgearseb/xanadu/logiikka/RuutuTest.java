package git.methodgearseb.xanadu.logiikka;

import git.methodgearseb.xanadu.tyokalut.Vari;
import git.methodgearseb.xanadu.osat.Ruutu;
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
        ruutu = new Ruutu(Vari.PINKKI, Vari.PUNAINEN);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void ruutuTallentaaOikeatVarit() {
        assertEquals(Vari.PINKKI, ruutu.getYlempiVari());
        assertEquals(Vari.PUNAINEN, ruutu.getAlempiVari());
    }
    
    @Test
    public void ruutuToStringToimii() {
        assertEquals("PINKKI, PUNAINEN", ruutu.toString());
    }
    
    @Test
    public void ruudutOvatSamatKunVaritOvatSamat() {
        assertEquals(ruutu, new Ruutu(Vari.PUNAINEN, Vari.PINKKI));
    }
    
    @Test
    public void ruudutOvatEriKunVaritOvatEri() {
        assertNotEquals(ruutu, new Ruutu(Vari.BEIGE, Vari.BEIGE));
    }
}
