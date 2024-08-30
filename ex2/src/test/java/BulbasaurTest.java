import org.junit.Test;
import static org.junit.Assert.*;

public class BulbasaurTest {

    @Test
    public void testInitialization() {
        Bulbasaur bulbasaur = new Bulbasaur();
        assertEquals(1, bulbasaur.getID());
        assertEquals(1, bulbasaur.getLevel());
        assertEquals("Bulbasaur", bulbasaur.getName());
    }

    @Test
    public void testEvolution() {
        Bulbasaur bulbasaur = new Bulbasaur();
        bulbasaur.setLevel(16);
        assertEquals(2, bulbasaur.getID());
        assertEquals("Ivysaur", bulbasaur.getName());

        bulbasaur.setLevel(32);
        assertEquals(3, bulbasaur.getID());
        assertEquals("Venusaur", bulbasaur.getName());
    }

    @Test
    public void testToString() {
        Bulbasaur bulbasaur = new Bulbasaur();
        bulbasaur.setLevel(20);
        assertEquals("Level: 20, ID: 2", bulbasaur.toString());
    }

    @Test
    public void testEquals() {
        Bulbasaur bulbasaur1 = new Bulbasaur();
        Bulbasaur bulbasaur2 = new Bulbasaur();
        bulbasaur1.setLevel(20);
        bulbasaur2.setLevel(20);
        assertTrue(bulbasaur1.equals(bulbasaur2));

        bulbasaur2.setLevel(30);
        assertFalse(bulbasaur1.equals(bulbasaur2));
    }

    @Test
    public void testCopy() {
        Bulbasaur original = new Bulbasaur();
        original.setLevel(25);
        Bulbasaur copy = original.copy();
        assertEquals(original.getID(), copy.getID());
        assertEquals(original.getLevel(), copy.getLevel());
        assertTrue(original.equals(copy));
    }
}