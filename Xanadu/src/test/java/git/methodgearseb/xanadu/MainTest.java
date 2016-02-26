/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package git.methodgearseb.xanadu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebastian
 */
public class MainTest {
    
    private Main main;
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        main = new Main();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void mainEiOleNull() {
        assertNotEquals(null, main);
    }
    
    @Test
    public void mainMain() {
        String[] args = new String[0];
        Main.main(args);
        assertEquals(true, true);
    }
}
