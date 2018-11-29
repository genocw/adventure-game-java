package Adventure.People;

import Adventure.Room;
import Adventure.Valuables.IValue;
import Adventure.Valuables.TreasureType;

public abstract class Player {

    private int healthMeter;
    private int loot;

    public Player() {
        this.healthMeter = 100;
        this.loot = 0;
    }

    public int checkHealth() {
        return healthMeter;
    }

    public void loseHealth(int value) {
        this.healthMeter -= value;
    }

    public int checkLoot() {
        return loot;
    }

    public void collectTreasure(TreasureType treasure) {
        this.loot += treasure.getValue();
    }

    public void checkRoom(Room room) {
//        enemy? true/false
//        valuables? true/false
    }

    public void heal(Cleric cleric) {
//        deal with healing
    }

}
