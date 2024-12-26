

public class Terrestrial extends Animal {
    private int nbrLegs; // Nombre de pattes

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family,name, age , isMammal);
        this.nbrLegs = nbrLegs;
    }

    // Getter et Setter
    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs=" + nbrLegs;
    }
}