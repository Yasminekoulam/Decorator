public class DoubleJumpDecorator extends CharacterDecorator {
    private boolean purchased = false;

    public DoubleJumpDecorator(Character character) {
        super(character);

        if (character.getStats() >= 30) {
            this.purchased = true;
        }
    }

    @Override
    public int getStats() {
        if (purchased) {
            return super.getStats() - 30;
        } else {
            return super.getStats();
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