package Adventure.Valuables;

public enum TreasureType implements IValue {

    GOBLET(300),
    NECKLACE(80),
    AMULET(150),
    RUBIES(220),
    COINS(410);

    private final int value;

    TreasureType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
