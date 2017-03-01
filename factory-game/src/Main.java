/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jibba_000
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FactoryFactory factory = new FactoryFactory();

        InfantryFactory humanFactory = factory.createInfantryFactory(1);
        InfantryFactory orcFactory = factory.createInfantryFactory(2);

        InfantryUnit soldier1 = humanFactory.createUnit(1);
        soldier1.setName("Human");
        InfantryUnit soldier2 = orcFactory.createUnit(2);
        soldier2.setName("Orc");

        while (soldier1.alive() && soldier2.alive()) {
            soldier1.attack(soldier2);
            soldier2.attack(soldier1);
        }

        /*RockHauler rockHauler = new RockHauler(4, 15, 20, 3);
        CrossbowMan crossbowMan = new CrossbowMan(10, 10, 20, 3);

        while (rockHauler.getLife() > 0 && crossbowMan.getLife() > 0) {
            rockHauler.setName("rockhauler");
            crossbowMan.setName("crossbowman");
            
            rockHauler.attack(crossbowMan);
            crossbowMan.attack(rockHauler);
         */
        if (soldier1.getLife() <= 0) {
            System.out.println("Human dead");

        }
        if (soldier2.getLife() <= 0) {
            System.out.println("Orc dead");
        }

    }

}
