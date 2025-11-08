public class IceSwordDecorator extends CharacterDecorator {
    private boolean purchased = false;

    public IceSwordDecorator(Character character) {
        super(character);
        if (character.getStats() >= 10) {
            this.purchased = true;
        }
    }
    @Override
    public int getStats() {
        if (purchased) {
            return super.getStats() - 10;
        } else {
            return super.getStats();
        }
    }
    @Override
    public String getDescription() {
        if (purchased) {
            return super.getDescription() + " + ⚔ Ice Sword";
        } else {
            return super.getDescription() + " (Ice Sword - Pas assez de coins!)";
        }
    }
}