/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import model.Vertice;

/**
 *
 * @author Math
 */
public class Aresta implements Comparable<Aresta> {

    private String id, source, target;
    private Vertice v1;
    private Vertice v2;
    private int valor = 0;

    public Aresta(String id, String source, String target, Vertice v1, Vertice v2, int valor) {
        this.id = id;
        this.source = source;
        this.target = target;
        this.v1 = v1;
        this.v2 = v2;
        this.valor = valor;
    }

    public Aresta() {
    }

    public Aresta(String id, int valor, String source, String target) {
        this.id = id;
        this.source = source;
        this.target = target;
        this.valor = valor;
    }

    public int compareTo(Aresta aresta) {
        if (this.valor < aresta.valor) {
            return -1;
        } else if (this.valor > aresta.valor) {
            return 1;
        } else {
            return 0;
        }
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getNome() {
        return id;
    }

    public void setNome(String nome) {
        this.id = nome;
    }

    public Vertice getV1() {
        return v1;
    }

    public void setV1(Vertice v1) {
        this.v1 = v1;
        this.source = v1.getId();
    }

    public Vertice getV2() {
        return v2;
    }

    public void setV2(Vertice v2) {
        this.v2 = v2;
        this.target = v2.getId();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public static Aresta getArestaByVertices(Vertice origem, Vertice destino, List<Aresta> arestas) {
        for (Aresta aresta : arestas) {
            if (aresta.getSource().equals(origem.getId()) && aresta.getTarget().equals(destino.getId())) {
                return aresta;
            }
        }
        return null;
    }
}
