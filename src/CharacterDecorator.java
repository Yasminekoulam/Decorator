public abstract class CharacterDecorator implements Character {
    protected Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
    }

    @Override
    public int getCoins() {
        return character.getCoins();
    }
    @Override
    public String getDescription() {
        return character.getDescription();
    }
}
