/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Español
 */
public class Vectores {
    public static void main(String[] args) {
        
    
    int indicepositivo=0;
    int i=0;
    int[]vecnumeros={11,-22,33,-44,55,-66,77,-88,99};
    int []vecposi = new int[10];
    for (i=0; i<vecnumeros.length; i++){
        System.out.print(vecnumeros[i]+ " ");
        
        if (vecnumeros[i]>0){
            vecposi[indicepositivo]=vecnumeros[i];
            indicepositivo++;
          
        }
    }
    
    for (i=0; i<vecnumeros.length; i++){
        System.out.print("\n" + vecposi[i]+ " ");
        
    }    
        System.out.println(""); 
        
     for (i=0; i<indicepositivo; i++){
        System.out.print("\n" + vecposi[i]+ " ");
     }
 }
}
