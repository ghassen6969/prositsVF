public class Aquatic extends Animal {
    private String habitat; // Endroit de vie de l'animal aquatique

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age , isMammal);
        this.habitat = habitat;
    }

    // Getter et Setter
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat + '\'';
    }
    // Méthode swim pour les animaux aquatiques
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}
