package Adventure.People;

import Adventure.Room;
import Adventure.Valuables.IValue;
import Adventure.Valuables.TreasureType;

public abstract class Player {

    private int healthMeter;
    private int treasureChest;

    public Player() {
        this.healthMeter = 100;
        this.treasureChest = 0;
    }

    public void collectTreasure(TreasureType treasure) {
        this.treasureChest += treasure.value;
    }

    public void checkRoom(Room room) {
//        enemy? true/false
//        valuables? true/false
    }

}
