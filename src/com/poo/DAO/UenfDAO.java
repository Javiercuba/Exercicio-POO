package com.poo.DAO;

import com.poo.Entidades.Aluno;
import com.poo.Nó;

public interface UenfDAO {

void inserirNoInicio(Aluno p);

void inserirNoFim(Aluno p);

void imprimir();

Nó excluir(String nome);
}
