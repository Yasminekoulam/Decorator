public class BasicCharacter implements Character {
    private String name;
    private int coins = 500;

    public void collectCoin() {
        coins += 1;
    }
    public int getcoins() {
        return coins;
    }
    @Override
    public int getStats() {
        return coins;
    }
    @Override
    public String getDescription() {
        return "BasicCharacter";
    }
}