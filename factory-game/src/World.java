/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jibba_000
 */
// implementing the singleton pattern
// only one world can be created, and that is Europe
public class World {

    private static World europe;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private World() {

    }

    public static World getWorldInstance() {
        if (europe instanceof World) {
            //do nothing
        } else {
            europe = new World();
        }
        europe.name = "Europe";
        return europe;
    }
}
