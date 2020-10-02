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
public class VetorDobra<Tipo> implements InterfaceVetor<Tipo> {

    private int tamanhoTotal;
    private int tamanhoAtual;
    private Object[] vetorDados;

    public VetorDobra(int tamanho) {
        this.tamanhoAtual = 0;
        this.tamanhoTotal = tamanho;
        this.vetorDados = new Object[tamanho];
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

            this.tamanhoTotal *= 2;
            Object[] vetorDadosDobrado = new Object[tamanhoTotal];
            for (int i = 0; i < (this.tamanhoTotal() / 2); i++) {
                vetorDadosDobrado[i] = this.vetorDados[i];
            }//for
            this.vetorDados = vetorDadosDobrado;
        }//if
    }//add

    @Override
    public void imprime() {
        for (Object dado : this.vetorDados) {
            if (dado != null) {
                System.out.print(dado + ", ");
            }
        }
    }

    @Override
    public Tipo remove(int index) {
        Tipo aux = null;
        if (index >= 0 && index < this.tamanhoTotal()) {
            aux = (Tipo) this.vetorDados[index];
            this.vetorDados[index] = null;
            this.tamanhoAtual--;
        }
        return aux;
    }

    @Override
    public Tipo getElemento(int index) {
        Tipo aux = null;
        if (index >= 0 && index < this.tamanhoTotal()) {
            aux = (Tipo) this.vetorDados[index];
        }
        return aux;
    }

    @Override
    public int tamanhoTotal() {
        return this.tamanhoTotal;
    }

    @Override
    public int tamanhoAtual() {
        return this.tamanhoAtual;
    }

}
