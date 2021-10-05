package com.poo;

import com.poo.DAO.UenfDAO;

public class UENFlist<Valor> extends List implements UenfDAO {
    public UENFlist() {
        super();
    }

    @Override
    public boolean vazia() {
        return super.vazia();
    }

    @Override
    public void inserirNoInicio(Object Valor) {
        super.inserirNoInicio(Valor);
    }

    @Override
    public void inserirNoFim(Object Valor) {
        super.inserirNoFim(Valor);
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }

    @Override
    public Nó excluir(Object Valor) {
        return super.excluir(Valor);
    }
}
