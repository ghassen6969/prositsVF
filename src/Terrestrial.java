public class Terrestrial extends Animal implements Omnivore<Food> {
    private int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(this.getName() + " is eating meat.");
        } else {
            System.out.println(this.getName() + " does not eat plants.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(this.getName() + " is eating plants.");
        } else {
            System.out.println(this.getName() + " does not eat meat.");
        }
    }


    public void eatPlantAndMeet(Food food) {
        if (food == Food.BOTH) {
            System.out.println(this.getName() + " is eating both plants and meat.");
        } else {
            System.out.println(this.getName() + " prefers a mixed diet.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {

    }
}
