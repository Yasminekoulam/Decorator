public class DoubleJumpDecorator extends CharacterDecorator {
    private boolean purchased = false;
    public DoubleJumpDecorator(Character character) {
        super(character);

        if (character.getCoins() >= 30) {
            this.purchased = true;
        }
    }
    @Override
    public int getCoins() {
        if (purchased) {
            return super.getCoins() - 30;
        } else {
            return super.getCoins();
        }
    }
    @Override
    public String getDescription() {
        if (purchased) {
            return super.getDescription() + " + Double Jump";
        } else {
            return super.getDescription() + " (Double Saut - Pas assez de coins!)";
        }
    }
}