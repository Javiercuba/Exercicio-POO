package com.poo;

import com.poo.Entidades.Aluno;

public class Main {

    public static void main(String[] args){

		Aluno aluno = new Aluno("Javier",21,80,1.80);
        Aluno aluno1 = new Aluno("Javi",21,80,1.80);
        Aluno aluno2 = new Aluno("Jav",21,80,1.80);
        Aluno aluno3 = new Aluno("J",21,80,1.80);

        UENFlist lista = new UENFlist();

        lista.inserirNoInicio(aluno);
        lista.inserirNoInicio(aluno1);
        lista.inserirNoInicio(aluno2);
        lista.inserirNoInicio(aluno3);
        lista.imprimir();

        lista.excluir("Jav");
        lista.imprimir();

    }
}
