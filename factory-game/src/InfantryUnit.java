/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jibba_000
 */
public abstract class InfantryUnit {

    private String name;
    private int range;
    private int armor;
    private int life;
    private int damage;
    private String race;

    public InfantryUnit(int range, int armor, int life, int damage) {
        this.range = range;
        this.armor = armor;
        this.life = life;
        this.damage = damage;
        this.name = name;
        this.race = race;
    }

    public void takeDamage(int damage) {
        int reduction = (int) (Math.random() * armor);
        if (damage > reduction) {
            life = life - (damage - reduction);
            System.out.println("Armor took " + reduction + " damage");
        } else {
            System.out.println("Armor took all damage!!!!!");
        }
    }

    public void attack(InfantryUnit unit) {
        int attackdamage = (int) (Math.random() * damage) + 1;
        System.out.println(name + " attacked " + unit.getName());
        unit.takeDamage(attackdamage);
        System.out.println(unit.getName() + " dealt " + attackdamage + " damage life remaining: " + unit.life);
    }

    public boolean alive() {
        if (life > 0) {
            return true;
        } else {
            return false;
        }
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

}
