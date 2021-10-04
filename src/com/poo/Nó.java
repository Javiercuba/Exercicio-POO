package com.poo;

import com.poo.Entidades.Aluno;

public class Nó<T> {
    T valor;
    Nó proximo;

    public Nó(T p)
    {
        this.valor = p;
        proximo = null;
    }

    public String toString()
    {
       return valor.toString();
    }
}
