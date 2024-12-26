

public class ZooManagement {

    public static void main(String[] args) {
        // Création des objets avec les constructeurs paramétrés en suivant l'ordre des paramètres
        Dolphin dolphin = new Dolphin("Cetacea", "Flipper", 5, true, "Ocean", 25.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Pingu", 3, false, "Antarctic", 200.0f);
        Terrestrial lion = new Terrestrial("Felidae", "Simba", 8, true, 4);

        // Affichage des objets pour vérifier leur état
        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println(lion);
        // Appel de la méthode swim pour chaque type d'animal
        dolphin.swim(); // Affichera "This dolphin is swimming."
        penguin.swim(); // Affichera "This penguin is swimming."
    }
}
