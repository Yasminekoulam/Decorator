public class SpeedBootsDecorator extends CharacterDecorator {
    private boolean purchased = false;

    public SpeedBootsDecorator(Character character) {
        super(character);

        if (character.getStats() >= 100) {
            this.purchased = true;
        }
    }

    @Override
    public int getStats() {
        if (purchased) {
            return super.getStats() - 100;
        } else {
            return super.getStats();
        }
    }

    @Override
    public String getDescription() {
        if (purchased) {
            return super.getDescription() + " + Speed Boots";
        } else {
            return super.getDescription() + " (bottes de vitesse - Pas assez de coins!)";
        }
    }
}
