/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoosystem;

import java.util.Scanner;

/**
 *
 * Objetivos -Cadastrar animais -Consultar cadastro -Cuidados do animal -Ahendar
 * visitas -Controlar dieta
 */
public class Zoosystem {

    public static void menu(int op) {
        if (op == 1) {
            System.out.println("\n====O QUE DESEJA FAZER?====");
            System.out.println("\n| 1 - Cadastrar animal     |");
            System.out.println("\n| 2 - Consultar cadastro   |");
            System.out.println("\n| 3 - Editar cadastro   |");
            System.out.println("\n| 4 - Cuidados do animal   |");
            System.out.println("\n| 5 - Agendar visita       |");
            System.out.println("\n| 6 - Alterar dieta        |");
            System.out.println("\n| 7 - Sair                 |");
            System.out.println("\n>... ");
        } else {
            System.out.println("\n====QUAL ANIMAL DESEJA CADASTRAR====");
            System.out.println("\n| 1 - Mamífero                     |");
            System.out.println("\n| 2 - Passaro                      |");
            System.out.println("\n| 3 - Peixe                        |");
            System.out.println("\n| 4 - Réptil                       |");
            System.out.println("\n>... ");
        }
    }

    public static void register(int option) {
        switch (option) {
            case 1:
                System.out.println("Mamifero");
                Mammal m1 = new Mammal("couro", 1, 5, "leite", true);
                System.out.println("Animal cadastrado com sucesso!");
                break;

            case 2:
                System.out.println("pass");
                Bird b1 = new Bird(15.2, 12, 2, 6, "alpist", false);
                System.out.println("Animal cadastrado com sucesso!");
                break;

            case 3:
                System.out.println("peixe");
                Fish f1 = new Fish(true, 3, 2, "algas", false);
                System.out.println("Animal cadastrado com sucesso!");
                break;

            case 4:
                System.out.println("rep");
                Reptile r1 = new Reptile(false, 4, 5, "alpist", false);
                System.out.println("Animal cadastrado com sucesso!");
                break;

            default:
                System.out.println("tem essa opção n");
                break;
        }

    }

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema do zoologico");
        while (true) {

            menu(1);

            switch (op.nextInt()) {
                case 1:
                    menu(2);
                    register(op.nextInt());
                    break;

                case 2:
                    System.out.println("foi a dois");
                    break;

                case 3:
                    System.out.println("foi a tres");
                    break;

                case 4:
                    System.out.println("foi a quatro");
                    break;

                case 5:
                    System.out.println("foi a cinco");
                    break;

                case 6:
                    System.out.println("foi a seis");

                    break;

                case 7:
                    System.out.println("foi a seis");

                    break;

                default:
                    System.out.println("tem essa opção n");
                    break;
            }
        }

    }

}
