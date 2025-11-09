public class IceSwordDecorator extends CharacterDecorator {
    private boolean purchased = false;

    public IceSwordDecorator(Character character) {
        super(character);
        if (character.getCoins() >= 10) {
            this.purchased = true;
        }
    }
    @Override
    public int getCoins() {
        if (purchased) {
            return super.getCoins() - 10;
        } else {
            return super.getCoins();
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