package com.poo;

abstract class List<T> {
    Nó primeiro, ultimo;
     //tipo generico em java

    public List()
    {
        primeiro = ultimo = null;
    }

    public boolean vazia()
    {
        return primeiro == null;
    }

    public void inserirNoInicio(T p)
    {
        Nó no = new Nó(p);
        no.proximo = primeiro;

        if(vazia())
            ultimo = no;

        primeiro = no;
    }

    public void inserirNoFim(T p)
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
            System.out.println(aux.valor);
            aux = aux.proximo;
        }
    }

    public Nó excluir(T valor)
    {
        Nó aux = primeiro, ant = null;

        while ((aux != null) && (aux.valor != valor)) {
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

