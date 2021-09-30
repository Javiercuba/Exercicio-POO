package com.poo;

import com.poo.Entidades.Aluno;

public class Nó {
    Aluno aluno;
    Nó proximo;

    public Nó(Aluno p)
    {
        this.aluno = p;
        proximo = null;
    }

    public String toString()
    {
       return aluno.toString();
    }
}
