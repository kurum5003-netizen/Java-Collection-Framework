/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maceraoyunu;

/**
 *
 * @author BERK
 */
public class KeyItem extends Item {
    private Room targetRoom;
    private String direction;

    public KeyItem(String id, String name, String description, Room targetRoom, String direction) {
        super(id, name, description);
        this.targetRoom = targetRoom;
        this.direction = direction;
    }

    @Override
    public void onUse(Player p, GameEngine ctx) {
        Room current = p.getCurrentRoom();
        current.connect(direction, targetRoom);
        System.out.println("Kapının kilidini açtın ve " + direction + "a geçebilirsin.");
    }
}


