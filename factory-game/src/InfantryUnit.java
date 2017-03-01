/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jibba_000
 */
public class InfantryUnit {

    private int range;
    private int armor;
    private int life;
    private int damage;
    
    public InfantryUnit(int range, int armor, int life, int damage) {
        this.range = range;
        this.armor = armor;
        this.life = life;
        this.damage = damage;
    }
    
    public void takeDamage(int damage) {
        int reduction = (int) (Math.random() * armor);
        if (damage > reduction) {
            life = life - (damage - reduction);
        }
    }
    
    public void attack(InfantryUnit unit) {
        int attackdamage = (int) (Math.random() * damage) + 1;
        unit.takeDamage(attackdamage);
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
}
