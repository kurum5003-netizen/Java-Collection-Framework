/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acilservis;

import java.util.PriorityQueue;
import java.util.Queue;

//öncelik sıralaması apandist>yanık>grip
public class AcilServis {

   
    public static void main(String[] args) {
       
        Queue<Hasta> queue=new PriorityQueue<Hasta>();
        Hasta hasta1=new Hasta("apandist","Elif Hanım");
        Hasta hasta2=new Hasta("grip","Arzu Hanım");
        Hasta hasta3=new Hasta("grip","Berk Bey");
        Hasta hasta4=new Hasta("yanık","Murat Bey");
        Hasta hasta5=new Hasta("apandist","Mehmet Bey");
        Hasta hasta6=new Hasta("yanık","Ayşe Hanım");
        Hasta hasta7=new Hasta("apandist","Mustafa Bey");
        Hasta hasta8=new Hasta("grip","Fatma Hanım");
        
        queue.offer(hasta1);
        queue.offer(hasta2);
        queue.offer(hasta3);
        queue.offer(hasta4);
        queue.offer(hasta5);
        queue.offer(hasta6);
        queue.offer(hasta7);
        queue.offer(hasta8);
        
        int i=1;
        System.out.println("Acil servis Sistemi");
        while(queue.isEmpty()!=true){
            System.out.println("*******************************************");
            System.out.println(i+".sırada");
            i++;
            System.out.println(queue.poll());
           
            
            
            
            
            
            }
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    

