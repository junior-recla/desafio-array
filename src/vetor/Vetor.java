/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor;

import util.*;

/**
 *
 * @author Carlos
 */
public class Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        InterfaceVetor<String> vetor = new VetorDobra(4);
//        InterfaceVetor<String> vetor = new VetorMetade(4);
        InterfaceVetor<String> vetor = new VetorLimitado(4);
        vetor.add("primeiro");
        vetor.add("segundo");
        vetor.add("terceiro");
        
        vetor.remove(1);
        vetor.add("quarto");
        vetor.add("quinto");
        vetor.imprime();
        System.out.println(vetor.tamanhoTotal());
    }
    
}
