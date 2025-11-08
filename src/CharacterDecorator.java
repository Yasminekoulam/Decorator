public abstract class CharacterDecorator implements Character {
    protected Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
    }

    @Override
    public int getStats() {
        return character.getStats();
    }
    @Override
    public String getDescription() {
        return character.getDescription();
    }
}
