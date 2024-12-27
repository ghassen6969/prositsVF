
    public static void main(String[] args) {
        // Création d'objets Aquatic, Penguin et Terrestrial
        Aquatic dolphin = new Aquatic("Cetacean", "Dolphin", 5, true, "Ocean");
        Penguin penguin = new Penguin("Bird", "Penguin", 3, false, "Arctic", 10.5f);
        Terrestrial lion = new Terrestrial("Mammal", "Lion", 8, true, 4);

        // Test de la méthode eatMeat() pour Aquatic
        System.out.println("\n=== Testing Aquatic ===");
        dolphin.eatMeat(Food.MEAT);
        dolphin.eatMeat(Food.PLANT);

        // Test de la méthode swim() pour Aquatic et Penguin
        dolphin.swim();
        penguin.swim();

        // Test de toutes les méthodes pour Terrestrial
        System.out.println("\n=== Testing Terrestrial ===");
        lion.eatMeat(Food.MEAT);
        lion.eatPlant(Food.PLANT);
        lion.eatPlantAndMeet(Food.BOTH);

        // Vérification pour Penguin
        System.out.println("\n=== Testing Penguin ===");
        penguin.eatMeat(Food.MEAT); // Hérité d'Aquatic
    }

