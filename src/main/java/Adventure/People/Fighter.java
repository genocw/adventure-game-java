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
        int enemyPowerAfter = enemy.getDamage() - this.weapon.getValue();
//      if firstClash > 0
//      secondClash = playerHealth - firstClash
        if (enemyPowerAfter > 0) {
            loseHealth(enemyPowerAfter);
        }
    }

    public changeWeapon(WeaponType newWeapon) {
        this.weapon = newWeapon;
    }

    public void checkWeapon(WeaponType altWeapon) {
        if (altWeapon.getValue() > this.weapon.getValue()) {
            this.weapon = altWeapon;
        }
    }

}
