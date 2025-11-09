public class MagicShieldDecorator extends CharacterDecorator {
    private boolean purchased = false;
    public MagicShieldDecorator(Character character) {
        super(character);

        if (character.getCoins() >= 25) {
            this.purchased = true;
        }
    }
    @Override
    public int getCoins() {
        if (purchased) {
            return super.getCoins() - 50;
        } else {
            return super.getCoins();
        }
    }
    @Override
    public String getDescription() {
        if (purchased) {
            return super.getDescription() + " + Magique Shield";
        } else {
            return super.getDescription() + " (Bouclier Magique - Pas assez de coins!)";
        }
    }
}