/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maceraoyunu;

/**
 *
 * @author BERK
 */
public class EnemyNPC extends NPC {
    private int hp;
    private int attackPower;

    public EnemyNPC(String name, int hp, int attackPower) {
        super(name);
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public void attack(Player p) {
        System.out.println(name + " sana saldırıyor! " + attackPower + " hasar verdi.");
        p.takeDamage(attackPower);
    }

    public void takeDamage(int dmg) {
        hp -= dmg;
        if (hp <= 0) System.out.println(name + " öldü!");
        else System.out.println(name + " kalan canı: " + hp);
    }

    public boolean isAlive() { return hp > 0; }
}