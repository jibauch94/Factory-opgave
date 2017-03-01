/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jibba_000
 */
public class OrcInfantryFactory extends InfantryFactory {
    public InfantryUnit createUnit(int techLevel) {
        InfantryUnit character;
        switch (techLevel) {
            case 1:
                character = new RockHauler(3, 10, 10, 5);
                break;
            case 2:
                character = new SpearTower(4, 11, 12, 6);
                break;
            case 3:
                character = new Archer(5, 12, 14, 7);
                break;
            case 4:
                character = new CrossbowMan(6, 13, 16, 8);
                break;
            case 5:
                character = new Musketeer(1, 14, 18, 9);
                break;

            default:
                return null;

        }
        return character;
    }
    
}
