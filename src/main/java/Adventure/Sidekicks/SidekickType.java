package Adventure.Sidekicks;

public enum SidekickType {

    OGRE(19),
    DRAGON(30);

    private final int power;

    SidekickType(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
