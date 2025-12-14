/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acilservis;


public class Hasta implements Comparable<Hasta>{
    private String hasta_adi;
    private int öncelik;
    private String şikayet;
    
    public Hasta(String şikayet,String hasta_adi){
        this.şikayet=şikayet;
        this.hasta_adi=hasta_adi;
        if(şikayet.equals("apandist")){
            this.öncelik=1;
        }
        else if(şikayet.equals("yanık")){
            this.öncelik=2;
        }
        else{
            this.öncelik=3;
        }
        
        
        
    }

    @Override
    public int compareTo(Hasta o) {
       if(this.öncelik>o.öncelik){
           return 1;
       }
       else if(this.öncelik<o.öncelik){
           return -1;
       }
       else{
           return 0;
       }
        
        
    }

    @Override
    public String toString() {
        String bilgi="Hasta adı:" + hasta_adi +"\nŞikayet:" + şikayet + "\nöncelik:" +öncelik;
        
        return bilgi;
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
