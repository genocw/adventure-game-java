package Adventure.Valuables;

public enum WeaponType implements IValue {

    SWORD(18),
    AXE(25),
    CLUB(9);

    private final int power;

    WeaponType(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
