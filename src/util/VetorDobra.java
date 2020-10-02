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
public class VetorDobra<Tipo> extends AbstractVetor<Tipo> {

    public VetorDobra(int tamanho) {
        super(tamanho);
    }

    @Override
    public void add(Tipo elemento) {
        super.add(elemento);
        if (this.tamanhoAtual() == this.tamanhoTotal()){
            dobra(this.tamanhoTotal * 2);
        }
    }

}
