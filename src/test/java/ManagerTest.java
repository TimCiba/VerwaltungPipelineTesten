
import mitarbeiter.Manager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {

    Manager manager;

    @BeforeEach
    void beforeEach(){
        manager = new Manager(5121, "Tim", 100000, 2);
    }

    @Test
    void testKonstruktor(){
        new Manager();
    }

    @Test
    void testManager(){
        new Manager(manager);
    }

    @Test
    void testSetBonusRichtig(){
        manager.setBonus(2);
        assertEquals(2, manager.getBonus());
    }

    @Test
    void testSetBonusFalsch(){
        manager.setBonus(10);
        assertEquals(0, manager.getBonus());
    }

    @Test
    void testEinkommen(){
        assertEquals(300000, manager.einkommen());
    }

    @Test
    void testToString(){
        assertEquals("\n" +
                "ID: 5021\n" +
                "Name: Tim hat Festgehalt: 100000.0 zuz�glich  Bonus 200000.0. Gesamteinkommen: 300000.0", manager.toString());
    }




}
