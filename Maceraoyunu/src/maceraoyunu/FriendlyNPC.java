/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maceraoyunu;

/**
 *
 * @author BERK
 */
public class FriendlyNPC extends NPC {
    private ConversationNode conversationRoot;

    public FriendlyNPC(String name, ConversationNode conversationRoot) {
        super(name);
        this.conversationRoot = conversationRoot;
    }

    public void talk() {
        if (conversationRoot != null) conversationRoot.startConversation();
        else System.out.println(name + ": Merhaba!");
    }
}
