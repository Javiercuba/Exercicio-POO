package com.poo.DAO;

import com.poo.Entidades.Aluno;
import com.poo.Nó;

public interface UenfDAO<P> {

void inserirNoInicio(P p);

void inserirNoFim(P p);

void imprimir();

Nó excluir(P nome);
}
