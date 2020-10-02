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
public class VetorLimitado<Tipo> extends AbstractVetor<Tipo> {

    public VetorLimitado(int tamanho) {
        super(tamanho);
    }

    @Override
    public void add(Tipo elemento) {
        if (elemento != null || this.tamanhoTotal() < this.tamanhoTotal()) {

            for (int i = 0; i < this.tamanhoTotal(); i++) {
                if (this.vetorDados[i] == null) {
                    this.vetorDados[i] = elemento;
                    this.tamanhoAtual++;

                    return;

                }//if
            }//for
        }//if
    }//add

}
