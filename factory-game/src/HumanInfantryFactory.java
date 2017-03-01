/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jibba_000
 */
public class HumanInfantryFactory extends InfantryFactory {

    public InfantryUnit createUnit(int techLevel) {
        InfantryUnit character;
        switch (techLevel) {
            case 1:
                character = new RockHauler(3, 5, 10, 5); 
                break;
            case 2:
                character = new SpearTower(4, 3, 12, 6);
                break;
            case 3:
                character = new Archer(5, 5, 14, 7);
                break;
            case 4:
                character = new CrossbowMan(6, 6, 16, 8);
                break;
            case 5:
                character = new Musketeer(1, 7, 18, 9);
                break;

            default:
                return null;

        }
        return character;
    }
}
