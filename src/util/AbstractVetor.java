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
public abstract class AbstractVetor<Tipo> {

    protected int tamanhoTotal;
    protected int tamanhoAtual;
    protected Object[] vetorDados;
    
    AbstractVetor(int tamanho) {
        this.tamanhoAtual = 0;
        this.tamanhoTotal = tamanho;
        this.vetorDados = new Object[tamanho];
    }

    public void imprime() {
        for (Object dado : this.vetorDados) {
            if (dado != null) {
                System.out.print(dado + ", ");
            }
        }
    }

    public int tamanhoTotal() {
        return this.tamanhoTotal;
    }

    public int tamanhoAtual() {
        return this.tamanhoAtual;
    }

    public abstract void add(Tipo elemento);

    /*
    não performatico, para melhorar a performace teria
    que ter um ponteiro pro index null mais proximo 
    do index 0 (zero)
     */
    public Tipo remove(int index) {
        Tipo aux = null;
        if (index >= 0 && index < this.tamanhoTotal()) {
            aux = (Tipo) this.vetorDados[index];
            this.vetorDados[index] = null;
            this.tamanhoAtual--;

            for (int i = index; i < this.tamanhoTotal(); i++) {
                if (this.vetorDados[i] == null && i != (this.tamanhoTotal() - 1)) {
                    this.vetorDados[i] = this.vetorDados[i + 1];
                    this.vetorDados[i + 1] = null;
                }
            }
        }
        return aux;
    }

    public Tipo getElemento(int index) {
        Tipo aux = null;
        if (index >= 0 && index < this.tamanhoTotal()) {
            aux = (Tipo) this.vetorDados[index];
        }
        return aux;
    }

    protected void dobra(int tamanhoNovo) {
        if(tamanhoNovo >  this.tamanhoTotal() ){
            Object[] vetorDadosDobrado = new Object[tamanhoNovo];
            for (int i = 0; i < this.tamanhoTotal(); i++) {
                vetorDadosDobrado[i] = this.vetorDados[i];
            }
            this.vetorDados = vetorDadosDobrado;
            this.tamanhoTotal = tamanhoNovo;
        }else{
            throw new IllegalArgumentException("O novo tamanho total é menor do que o atual");
        }
    }

}
