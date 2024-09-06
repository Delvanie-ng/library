package com.library;

import java.util.Scanner;

public class Main {
    public static final String LISTER = "l";
    public static final String ADD = "e";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenue sur le repertoire des bibliotheques de la ville");
            System.out.println("Pour voir la liste des bibliotheques, tapez +\""+LISTER+"\"\n" +
                    "Sinon +\""+ADD+"\" pour ajouter une bibliotheque");

            String userCommand = sc.nextLine();
            switch (userCommand.toLowerCase()){
                case LISTER:
                    break;
                case ADD:
                    break;
                default:
                    System.out.println("Commande non existante");
            }

        }
    }
}