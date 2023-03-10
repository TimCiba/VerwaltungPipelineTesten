package mitarbeiter;

import java.io.Serializable;

public class Manager extends BueroArbeiter implements Serializable {

    private double bonusSatz;

    public Manager(Manager original) {
        super(original);
        bonusSatz = original.getBonus();
    }

    public Manager() {

    }

    public Manager(int id, String name, double festgehalt, double bonus) throws IllegalArgumentException {
        // Die Manager-IDs fangen alle mit 50 an
        super(/*Math.abs(id) % 100 + 5000*/id, name, festgehalt);
        setBonus(bonus);
    }

    public double getBonus() {
        return bonusSatz;
    }

    public void setBonus(double bonusSatz) {
        // Der Bonus liegt zwischen 1 und 200%
        if (bonusSatz > 0 && bonusSatz <= 2)
            this.bonusSatz = bonusSatz;
        else
            this.bonusSatz = 0;
    }

    protected void setID(int id) {
        super.setID(Math.abs(id) % 100 + 5000);
    }

    public double berechneBonus() {
        return getFestgehalt() * bonusSatz;
    }

    public double einkommen() {
        return getFestgehalt() + berechneBonus();
    }

    public String toString() {
        return super.toString() + " zuz�glich  Bonus " + berechneBonus() + ". Gesamteinkommen: " + einkommen();
    }
}
