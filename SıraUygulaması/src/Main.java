
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Main {
    public static void main(String[] args) throws InterruptedException{
    Random random=new Random();
    Queue<String> pide_sayisi = new LinkedList<String>();
    pide_sayisi.offer("oğuz");
    pide_sayisi.offer("ahmet");
    pide_sayisi.offer("alparslan");
    pide_sayisi.offer("göktürk");
    pide_sayisi.offer("resul");
    pide_sayisi.offer("berk");
    pide_sayisi.offer("yasemin");
    pide_sayisi.offer("mehmet");
    pide_sayisi.offer("mustafa");
    pide_sayisi.offer("murat");
   
    
    int pide = random.nextInt(10)+1;
    
        System.out.println("pideler çıkıyor..."); 
           Thread.sleep(3000);
        System.out.println("çıkan pide sayısı:" + pide);
    
        while(pide!=0){
            
            System.out.println("pideler alınıyor...");
            Thread.sleep(1000);
            System.out.println("alan kisi:" + pide_sayisi.poll());
            
            pide-=1;
            
  
        }
        System.out.println("pide kalmadı!!!");
        System.out.println("kalan kisiler:");
        for(String a : pide_sayisi){
            System.out.println(a);
        }
    
    
    
    }
    
    
}
