/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maceraoyunu;

/**
 *
 * @author BERK
 */
public class ConversationChoice {
    private String text;
    private ConversationNode nextNode;

    public ConversationChoice(String text, ConversationNode nextNode) {
        this.text = text;
        this.nextNode = nextNode;
    }

    public String getText() { return text; }
    public ConversationNode getNextNode() { return nextNode; }
}
