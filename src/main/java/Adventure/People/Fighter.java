package Adventure.People;

import Adventure.Enemies.EnemyType;
import Adventure.Valuables.WeaponType;

public class Fighter extends Player {

    private WeaponType weapon;

    public Fighter(WeaponType weapon) {
        super();
        this.weapon = weapon;
    }

    public WeaponType getWeapon() {
        return this.weapon;
    }

    public void fight(EnemyType enemy) {
//      firstClash = enemy.power - weapon.power
//      if firstClash > 0
//      secondClash = playerHealth - firstClash
//      if secondClash < 1
//      game over
//      elseif secondClash < 30
//      pay healer
    }


}
