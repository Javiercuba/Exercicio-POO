package com.poo;

import com.poo.DAO.UenfDAO;
import com.poo.Entidades.Aluno;

public class UENFlist implements UenfDAO {
    Nó primeiro, ultimo;

    public UENFlist()
    {
        primeiro = ultimo = null;
    }

    public boolean vazia()
    {
        return primeiro == null;
    }

    public void inserirNoInicio(Aluno p)
    {
        Nó no = new Nó(p);
        no.proximo = primeiro;

        if(vazia())
            ultimo = no;

        primeiro = no;
    }

    public void inserirNoFim(Aluno p)
    {
        Nó no = new Nó(p);

        if (vazia())
            primeiro = no;
        else
            ultimo.proximo = no;

        ultimo = no;

    }

    public void imprimir()
    {
        Nó aux = primeiro;

        while (aux != null)
        {
            System.out.println(aux.aluno.getNome());
            aux = aux.proximo;
        }
    }

    public Nó excluir(String nome)
    {
        Nó aux = primeiro, ant = null;

        while ((aux != null) && (aux.aluno.getNome() != nome)) {
            ant = aux;
            aux = aux.proximo;
        }

        if (aux == null)
            return null;

        if (aux == primeiro)
        {
            if (primeiro == ultimo)
                ultimo = null;
            primeiro = aux.proximo;
        }
        else if (aux == ultimo)
        {
            ant.proximo = null;
            ultimo = ant;
        } else{
            ant.proximo = aux.proximo;
        }
        return aux;
    }
}
