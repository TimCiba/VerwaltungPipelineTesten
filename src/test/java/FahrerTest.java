import mitarbeiter.Fahrer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FahrerTest {

    Fahrer fahrer;

    @BeforeEach
    void beforeEach(){
        fahrer = new Fahrer(2000, "Fabian", 100, "B");
    }

    @Test
    void testToString(){
        assertEquals("Fahrer \n" +
                "ID: 3000\n" +
                "Name: FabianEinkommen: 0.0 bei 0 gearbeiteten Stunden. hat F�hrerscheinklasse B", fahrer.toString());
    }

    @Test
    void testGetFueherschein(){
        assertEquals("B", fahrer.getFuehrerSchein());
    }

    @Test
    void testSetFestgehaltZuGering(){
        assertThrows(IllegalArgumentException.class, () -> fahrer.setFuehrerSchein("ZZ"));
    }

}
