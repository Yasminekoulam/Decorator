public class Main {
    public static void main(String[] args) {
        // Combinaison 1: Guerrier complet
        Character guerrier = new DoubleJumpDecorator(
                new MagicShieldDecorator(new IceSwordDecorator(new SpeedBootsDecorator(new BasicCharacter()))));

        // Combinaison 2: Voleur rapide
        Character voleur = new DoubleJumpDecorator(
                new SpeedBootsDecorator(new SpeedBootsDecorator(new BasicCharacter())));

        System.out.println("__________COMBINAISON GUERRIER______________ ");
        System.out.println(guerrier.getDescription());
        System.out.println("Stats: " + guerrier.getStats() +" coins");

        System.out.println("\n_________ COMBINAISON VOLEUR___________");
        System.out.println(voleur.getDescription());
        System.out.println("Stats: " + voleur.getStats() +" coins");
    }
}