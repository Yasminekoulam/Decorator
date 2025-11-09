public class BasicCharacter implements Character {
    private String name;
    private int coins = 500;

    public void collectCoin() {
        coins += 1;
    }

    @Override
    public int getCoins() {
        return coins;
    }
    @Override
    public String getDescription() {
        return "BasicCharacter";
    }
}