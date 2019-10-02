import Coffee.Americano;
import Coffee.Espresso;
import Coffee.Latte;
import Tea.Black_Tea;
import Tea.Green_Tea;
import Tea.Yellow_Tea;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void trueMilk() {
        Americano a = new Americano(2,2);
        assertEquals(2, a.getMilk());
    }
    @Test
    public void trueSugar() {
        Americano a = new Americano(2,2);
        assertEquals(2, a.getSugar());
    }

    @Test
    public void trueAmericanop() {
        Americano a = new Americano(2,2);
        assertEquals("coffee", a.getType());
    }
    @Test
    public void trueLatte() {
        Latte a = new Latte(2,2);
        assertEquals("coffee", a.getType());
    }
    @Test
    public void trueEspresso() {
        Espresso a = new Espresso(2,2);
        assertEquals("coffee", a.getType());
    }
    @Test
    public void trueBlack() {
        Black_Tea a = new Black_Tea(2,2);
        assertEquals("Tea", a.getType());
    }
    @Test
    public void trueYellow() {
        Yellow_Tea a = new Yellow_Tea(2,2);
        assertEquals("Tea", a.getType());
    }
    @Test
    public void trueGreen() {
        Green_Tea a = new Green_Tea(2,2);
        assertEquals("Tea", a.getType());
    }
}