/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jibba_000
 */
public class FactoryFactory {

    public InfantryFactory createInfantryFactory(int race) {

        HumanInfantryFactory human = new HumanInfantryFactory();
        OrcInfantryFactory orc = new OrcInfantryFactory();

        if (race == 1) {
            return human;
        }
        if (race == 2) {
            return orc;
        } else {
            return null;
        }

    }
}
