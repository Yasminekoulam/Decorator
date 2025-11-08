public class MagicShieldDecorator extends CharacterDecorator {
    private boolean purchased = false;

    public MagicShieldDecorator(Character character) {
        super(character);

        if (character.getStats() >= 50) {
            this.purchased = true;
        }
    }

    @Override
    public int getStats() {
        if (purchased) {
            return super.getStats() - 50;
        } else {
            return super.getStats();
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