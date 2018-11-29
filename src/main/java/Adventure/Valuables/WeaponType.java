package Adventure.Valuables;

public enum WeaponType implements IValue {

    SWORD(18),
    AXE(25),
    CLUB(9);

    private final int powerValue;

    WeaponType(int powerValue) {
        this.powerValue = powerValue;
    }

    public int getValue() {
        return powerValue;
    }
}
