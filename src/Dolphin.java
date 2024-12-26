

public class Dolphin extends Aquatic {
    private float swimmingSpeed; // Vitesse de nage du dauphin

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family,name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    // Getter et Setter
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingSpeed=" + swimmingSpeed;

    }
    // Redéfinition de la méthode swim pour afficher un message spécifique au dauphin
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

}
