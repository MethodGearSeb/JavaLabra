package git.methodgearseb.xanadu.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PelialueTest {
    
    Pelialue pelialue;
    
    public PelialueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pelialue = new Pelialue();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void pelialueellaOnKuusitoistaRuutua() {
        assertEquals(16, pelialue.getRuudut().size());
    }
}
