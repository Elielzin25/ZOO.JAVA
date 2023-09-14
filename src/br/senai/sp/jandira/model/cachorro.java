package br.senai.sp.jandira.model;

import java.util.Scanner;

public class cachorro {

    String nome, apelido, raca, cor;

    int idade;

    Scanner teclado = new Scanner(System.in);

    public void cadastrarcachorro() {

        System.out.println("/-------      cachorro     -----/");
        System.out.println("informe o nome: ");
        nome = teclado.nextLine();
        System.out.println("informe o apelido:");
        apelido = teclado.nextLine();
        System.out.println("informe a raça:");
        raca = teclado.nextLine();
        System.out.println("informe a cor:");
        cor = teclado.nextLine();
        System.out.println("informe a idade:");
        idade = teclado.nextInt();
        teclado.nextLine();
        System.out.println("/---------cadastro finalizado-----------/");



    }

    public void listarcachorro(){

        for (cachorro cachorro : listrcachorro(){
            System.out.println(cachorro.nome);
        }
    }
    }