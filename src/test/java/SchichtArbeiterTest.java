
import mitarbeiter.Mitarbeiter;
import mitarbeiter.SchichtArbeiter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SchichtArbeiterTest {

    SchichtArbeiter schichtArbeiter;

    @BeforeEach
    void beforeEach(){
        schichtArbeiter = new SchichtArbeiter(3123, "Mario", 200);
    }

    @Test
    void testGetStundensatz(){
        assertEquals(schichtArbeiter.getStundenSatz(), 200);
    }

    @Test
    void testZuKleinerStundensatz(){
        assertThrows(IllegalArgumentException.class, () -> schichtArbeiter.setStundenSatz(2));
    }

    @Test
    void testSchichtArbeiter(){
        Mitarbeiter schichtarbeiter = new SchichtArbeiter(3012, "Tim", 122);
        Mitarbeiter neu = new SchichtArbeiter(schichtArbeiter);
        assertEquals(3123, neu.getID());
    }

    @Test
    void testArbeite(){
        schichtArbeiter.arbeite(50);
        assertEquals(50, schichtArbeiter.getAnzahlStunden());
    }
    @Test
    void testArbeiteKleiner0(){
        schichtArbeiter.arbeite(-10);
        assertEquals(0, schichtArbeiter.getAnzahlStunden());
    }

    @Test
    void testEinkommen(){
        schichtArbeiter.setStundenSatz(22);
        schichtArbeiter.setAnzahlStunden(10);
        assertEquals(220, schichtArbeiter.einkommen());
    }

    @Test
    void testToString(){
        schichtArbeiter.setAnzahlStunden(10);
        schichtArbeiter.setStundenSatz(22);
        assertEquals("\n" +
                "ID: 3123\n" +
                "Name: MarioEinkommen: 220.0 bei 10 gearbeiteten Stunden.", schichtArbeiter.toString());
    }
}
