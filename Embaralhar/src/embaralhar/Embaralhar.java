/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package embaralhar;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Wellysson
 */
public class Embaralhar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList numeros = new ArrayList();
        
        for(int i=1; i<60; i++){
            
            numeros.add(i);
            
        }
        
        Collections.shuffle(numeros);
        
        System.out.print("Os numeros sorteados foram: ");
        
        int j=0;
        while(j<6){
            System.out.print(numeros.get(j++) + "-");
        }
        
        System.out.println("\nFim da execução!");
        
    }
    
}
