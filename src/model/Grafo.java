/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import model.Aresta;

/**
 *
 * @author Aluno
 */
public class Grafo {
    
    private String id;
    private TipoGrafo ordenacao;
    private ArrayList<Vertice> listaVertice = new ArrayList<Vertice>();
    private ArrayList<Aresta> listaAresta = new ArrayList<Aresta>();
    

    public String getNome() {
        return id;
    }

    public Grafo(String id, TipoGrafo ordenacao) {
        this.id = id;
        this.ordenacao = ordenacao;
        
    }

    public Grafo() {
        
    }

    public ArrayList<Vertice> getListaVertice() {
        return listaVertice;
    }

    public void setListaVertice(Vertice v) {
       listaVertice.add(v);
    }

    public TipoGrafo getOrdenacao() {
        return ordenacao;
    }

    public void setOrdenacao(TipoGrafo ordenacao) {
        this.ordenacao = ordenacao;
    }

    public void setNome(String nome) {
        this.id = nome;
    }

    public ArrayList<Aresta> getListaAresta() {
        return listaAresta;
    }

    public void setListaAresta(Aresta a ) {
        this.listaAresta.add(a);
    }

    
    
    
}
