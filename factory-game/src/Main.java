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
        RockHauler rockHauler = new RockHauler(4, 15, 20, 3);
        CrossbowMan crossbowMan = new CrossbowMan(10, 10, 20, 3);

        while (rockHauler.getLife() > 0 && crossbowMan.getLife() > 0) {
            rockHauler.setName("rockhauler");
            crossbowMan.setName("crossbowman");
            
            rockHauler.attack(crossbowMan);
            crossbowMan.attack(rockHauler);

            if (rockHauler.getLife() <= 0) {
                System.out.println("Rockhauler dead"); 
                
            }
            if(crossbowMan.getLife() <= 0){
                System.out.println("CrossbowMan dead");
            }
            
        }

    }

}
