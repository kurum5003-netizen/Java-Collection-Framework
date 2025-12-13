/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

public class Main {
    
    
    public static boolean PalindromMu(String cumle, Stack<Character> stack){
        for(int i=cumle.length()/2 + 1 ; i<cumle.length();i++){
            
            if(cumle.charAt(i) != stack.pop())
            return false;
        }
            
             return true; 
            
        }
      
       
        
        
    
    
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack= new Stack<Character>();
        System.out.println("Bir kelime giriniz:");
        String kelime=scanner.nextLine();
        int i;
        for(i=0;i<kelime.length()/2;i++){
            
            stack.push(kelime.charAt(i));
            
        }
        
        
        if(PalindromMu(kelime,stack)){
            System.out.println("palindrom");
        }
        else{
            System.out.println("palindrom değil");
        }
        
        
        
        
        
    }
    
    
 
}
