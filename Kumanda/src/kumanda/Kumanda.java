/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kumanda;

import java.awt.BorderLayout;
import java.util.Scanner;


public class Kumanda {

   
    public static void main(String[] args) {
        Ayarlar ayarlar=new Ayarlar();
        Scanner scanner =new Scanner(System.in);
        String islemler="kanal eklemek için 1 e basınız" + "\nkanal silmek için 2 ye basınız" + "\nkanalları görüntülemek için 3 basınız" + "\n çıkmak için q ya basınız";
         
        System.out.println("kumanda programı");
        System.out.println("********************");
        
        while(true){
            System.out.println(islemler);
            String islem=scanner.nextLine();
            
            
            if(islem.equals("1")){
                System.out.println("eklemek istediğiniz kanalın adı");
                String ad=scanner.nextLine();
                ayarlar.kanalekle(ad);
                System.out.println("kanal sayısı:"+ayarlar.kanalsayısı());
                
            }
            else if(islem.equals("2")){
                System.out.println("silmek istediğiniz kanalın adı");
                String ad=scanner.nextLine();
                ayarlar.kanalsil(ad);
                System.out.println("kanal sayısı:"+ayarlar.kanalsayısı());
                
            }
            else if(islem.equals("3")){
                for(String a :ayarlar){
                    System.out.println(a);
                }
                
                System.out.println("kanal sayısı:"+ ayarlar.kanalsayısı()); 
                
                
            }
            else if(islem.equals("q")){
                System.out.println("çıkılıyor...");
                break;
            }
            else{
                System.out.println("geçersiz karekter!!");
                continue;
            }
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
