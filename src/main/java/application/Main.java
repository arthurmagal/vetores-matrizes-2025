package application;

import java.util.ArrayList;
import java.util.List;

import application.lista.ListaSimples;
import application.pilha.PilhaSimples;

public class Main {
    public static void main(String[] args) {

        //declaracao vetores
        int[] numeros = new int[5];

        //declaracao matrizes
        int[][] matriz = new int[5][3];

        //declaracao lista simples
        ListaSimples lista = new ListaSimples();
        lista.adicionar("primeiro");
        lista.adicionar("segundo");
        lista.adicionar("terceiro");
        lista.remover(1);

        List<String> lista2 = new ArrayList<String>();
        lista2.add("teste");

        System.out.println(lista);


        PilhaSimples pilha = new PilhaSimples(3);
        pilha.empilhar("Primeiro elemento");
        pilha.empilhar("Segundo elemento");

        System.out.println(pilha.desempilhar());
        pilha.empilhar("Terceiro elemento");
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.desempilhar());

    
    }
}

