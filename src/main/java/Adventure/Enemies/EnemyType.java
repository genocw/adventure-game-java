package Adventure.Enemies;

public enum EnemyType {

    TROLL(20),
    ORC(30);

    private final int damage;

    EnemyType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
