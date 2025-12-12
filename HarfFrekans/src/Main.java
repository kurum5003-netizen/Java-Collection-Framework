/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
public class Main {
    
    public static void Yazdır(Map<Character,Integer> map){
        
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            
            System.out.println("Key:"+entry.getKey() +"Deger:" +entry.getValue());
            
            
        }
        
        
        
        
        
    }
    
    
    
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Map<Character,Integer> frekans =new TreeMap<Character,Integer>();// sıralı ve düzgün görüntü için tree map kullanıyoruz
        System.out.println("Lütfen bir cümle giriniz");
        System.out.println("***************************************");
        String cümle=scanner.nextLine();
        int i;
        for(i=0;i<cümle.length();i++){
            char c =cümle.charAt(i);
           if(frekans.containsKey(c)) {
               
               frekans.replace(c,frekans.get(c)+1 );
               
           }
           else{
               
               frekans.put(c, 1);
               
           }
            
            
            
        }
        
        
        Yazdır(frekans);
        
        
        
    }
    
    
    
    
 
}
