/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kumanda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Ayarlar implements Iterable<String>{
    public List<String> kanal=new ArrayList<String>();
    
    public class kanalyazdır implements Iterator<String>{
          private int index=0;
        @Override
        public boolean hasNext() {
            if(index>=kanal.size()){
                return false;
            }
            else{
                return true;
            }
            
            
        }

        @Override
        public String next() {
            String kanallar =kanal.get(index);
            index++;
            return kanallar;
            
        }
        
        
        
        
        
        
        
    }
    
   
    public void kanalekle(String kanalad){
        System.out.println("kanal eklendi!");
        kanal.add(kanalad);
        
        
        
    }
    public void kanalsil(String kanalad){
        if(!kanal.contains(kanalad)){
            System.out.println("kanal bulunamadı");
            return;
        }
        
        
        System.out.println("kanal silindi!");
        kanal.remove(kanalad);
        
        
        
    }
  public int kanalsayısı(){
      
    return  kanal.size();
      
  } 

    @Override
    public Iterator<String> iterator() {
       return new kanalyazdır();
    }
    
    
    
    
    
    
    
  
    
}
