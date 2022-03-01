package com.company;

import com.company.BoatAndCo.Person;
import com.company.BoatAndCo.Port;
import com.sun.source.tree.WhileLoopTree;



public class Main {

    static int disparues = 26000;
    static int annee2018 = 182854;
    static String blabla = "chaque année";
    static int blablablablalba = 156854;


    public static void main(String[] args) {
        // write your code here
        System.out.println("Chaque année," + disparues + " espèces disparaissent de la surface de la planète. En 2018, elles étaient au nombre de " + annee2018);
        System.out.println("En 2019, elles n'étaient plus que de " + (annee2018 - disparues));
        annee2018--;
        System.out.println("En une journée elle sont peut être passée de " + annee2018);

        if ((annee2018 - disparues) <= blablablablalba) {
            System.out.println("ça craint");
        } else {
            System.out.println("tranquille");

        }
        switch (blablablablalba) {
            case 156854:
                System.out.println("ça craint de ouf");
                break;
            case 157000:
                System.out.println("c'est un peu mieux");
                break;
            default:
                System.out.println("valeur non traitée");
        }
        for (int i=0; i<7; i++){
            System.out.println("Les océans sont magnifiques");
        }
        int greu = 0;
        while (greu < 7){
            greu += 1;
            System.out.println("Les océans blabla");
        }

        /*Person clientDupont = new Person();
        clientDupont.firstName = "Greg";
        clientDupont.lastName = "Dupont";
        clientDupont.dateOfBirth = "18/09/1985";
        Person clientDurant = new Person();
        clientDurant.firstName = "Leo";
        clientDurant.lastName = "Durant";
        clientDurant.dateOfBirth = "05/11/05";
        System.out.println(clientDupont.firstName + clientDupont.lastName + clientDupont.dateOfBirth);
        System.out.println(clientDurant.firstName + clientDupont.lastName + clientDupont.dateOfBirth); */

        Person clientDupont = new Person("Greg", "Dupont", "12/05/62");
        System.out.println(clientDupont.firstName + clientDupont.lastName + clientDupont.dateOfBirth);
        Person clientDurant = new Person("Jerome", "Durant", "12/04/22");

        clientDupont.sePresenter(true);
        System.out.println();
        clientDurant.sePresenter("cotisesAjour");
        System.out.println();

        Port calais = new Port();
        calais.



    }
}
