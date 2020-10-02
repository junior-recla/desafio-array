/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Carlos
 * @param <Tipo>
 */
public interface InterfaceVetor<Tipo> {
        
    abstract void imprime();
    
    abstract int tamanhoTotal();
    
    abstract int tamanhoAtual();
    
    abstract void add(Tipo elemento);
    
    abstract Tipo remove(int index);
    
    abstract Tipo getElemento(int index);
    
    
}
