package com.poo;

public class Main {

    public static void main(String[] args){


        UENFlist<Integer> listaInt = new UENFlist();
        UENFlist<String> listaString = new UENFlist();

        // Lista de inteiros
        listaInt.inserirNoInicio(2);
        listaInt.inserirNoInicio(3);
        listaInt.inserirNoInicio(4);
        listaInt.inserirNoInicio(70);
        listaInt.imprimir();

        // Lista de String
        listaString.inserirNoInicio("Javier");
        listaString.inserirNoInicio("Yasmin");
        listaString.inserirNoInicio("JaYa");
        listaString.imprimir();


    }
}
