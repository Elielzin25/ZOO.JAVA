package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zoo {

    Scanner teclado = new Scanner(System.in);

    List<cachorro> listcachorro = new ArrayList<>();


    public void menu(){
        boolean continuar = true;
        while (continuar){
            System.out.println("----------- menu ------------");
            System.out.println("1 - cadastrar cachorro");
            System.out.println("2 - listar cachorro");
            System.out.println("3 - sair");
            System.out.println("-----------------------------");

            int opcapuser = teclado.nextInt();
            teclado.nextLine();

            cachorro objCachorro = new cachorro();

            switch (opcapuser){

                case 1:
                    objCachorro.cadastrarcachorro();
                    addAnimal(objCachorro);
                    listcachorro.size();


                    break;

                case 2:

                    break;

                case 3:
                    continuar = false;
                    break;


            }

        }
    }

    public void  addAnimal (cachorro cachorro){
        listcachorro.add(cachorro);

        }


        public void listDog(cachorro DOG){




        }

}
