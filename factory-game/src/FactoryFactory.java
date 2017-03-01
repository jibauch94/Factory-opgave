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
        InfantryFactory factory;

        switch (race) {
            case 1:
                factory = new HumanInfantryFactory();
                break;
            case 2:
                factory = new OrcInfantryFactory();
                break;
            default:
                return null;
        }
        return factory;
    }
}
