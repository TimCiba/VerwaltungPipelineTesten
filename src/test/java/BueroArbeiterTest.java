
import mitarbeiter.BueroArbeiter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BueroArbeiterTest {

    BueroArbeiter bueroArbeiter;

    @BeforeEach
    void beforeEach(){
        bueroArbeiter = new BueroArbeiter(3333, "Mario", 2222);
    }

    @Test
    void testBueroArbeiter(){
        bueroArbeiter.setFestgehalt(2222);
        BueroArbeiter neu = new BueroArbeiter(bueroArbeiter);
        assertEquals(2222, neu.getFestgehalt());
    }

    @Test
    void testBueroArbeiterWithPara(){
        BueroArbeiter bueroArbeiter1 = new BueroArbeiter(1222,"Tim", 2222);
        assertEquals(bueroArbeiter1.getFestgehalt(), 2222);
    }

    @Test
    void testEinkommen(){
        assertEquals(2222, bueroArbeiter.einkommen());
    }

    @Test
    void testKonstruktor(){
        new BueroArbeiter();
    }

    @Test
    void testSetFestgehalt(){
        bueroArbeiter.setFestgehalt(5000);
        assertEquals(5000, bueroArbeiter.getFestgehalt());
    }

    @Test
    void testSetFestgehaltZuGering(){
        assertThrows(IllegalArgumentException.class, () -> bueroArbeiter.setFestgehalt(50));
    }

    @Test
    void testToString(){
        assertEquals("\n" +
                "ID: 5333\n" +
                "Name: Mario hat Festgehalt: 2222.0", bueroArbeiter.toString());
    }
}
