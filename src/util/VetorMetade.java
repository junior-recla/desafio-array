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
public class VetorMetade<Tipo> extends AbstractVetor<Tipo> {

    public VetorMetade(int tamanho){
        super(tamanho);
    }

    @Override
    public void add(Tipo elemento) {
        if (elemento != null) {

            for (int i = 0; i < this.tamanhoTotal(); i++) {
                if (this.vetorDados[i] == null) {
                    this.vetorDados[i] = elemento;
                    this.tamanhoAtual++;
                    if (this.tamanhoAtual() < this.tamanhoTotal()) {
                        return;
                    }//if
                }//if
            }//for
            dobra( (int) (this.tamanhoTotal * 1.5)  );
            //dobra(  this.tamanhoTotal + (this.tamanhoTotal / 2)  );
        }//if
    }//add

}
