public class SpeedBootsDecorator extends CharacterDecorator {
    private boolean purchased = false;
    public SpeedBootsDecorator(Character character) {
        super(character);

        if (character.getCoins() >= 100) {
            this.purchased = true;
        }
    }
    @Override
    public int getCoins() {
        if (purchased) {
            return super.getCoins() - 100;
        } else {
            return super.getCoins();
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
