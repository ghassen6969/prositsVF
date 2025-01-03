

public class Penguin extends Aquatic {
    private float swimmingDepth; // Profondeur de nage sous l'eau du pingouin

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family,name, age,  isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    // Getter et Setter
    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth=" + swimmingDepth;
    }
    // Redéfinition de la méthode swim pour afficher un message spécifique au pingouin
    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}
