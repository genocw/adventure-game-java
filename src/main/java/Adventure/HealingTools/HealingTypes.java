package Adventure.HealingTools;

public enum HealingTypes {

    HERBS(25),
    POTION(50);

    private final int health;

    HealingTypes(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
}
