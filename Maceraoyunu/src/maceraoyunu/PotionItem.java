/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maceraoyunu;

/**
 *
 * @author BERK
 */
public class PotionItem extends Item {
    private int healAmount;

    public PotionItem(String id, String name, String description, int healAmount) {
        super(id, name, description);
        this.healAmount = healAmount;
    }

    @Override
    public void onUse(Player p, GameEngine ctx) {
        p.heal(healAmount);
        System.out.println("Can puanın " + healAmount + " arttı.");
    }
}

