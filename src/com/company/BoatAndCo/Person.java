package com.company.BoatAndCo;

public class Person {
    public String firstName;
    public String lastName;
    public String dateOfBirth;



    public Person(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public void sePresenter(boolean cotisAJour) {
        if (cotisAJour) {
            System.out.println("cotis à jour");
        } else {
            System.out.println("cotis PAS à jour");
        }
    }

    public void sePresenter( String cotisesAjour) {
        if (cotisesAjour == "cotisesAjour") {
            System.out.println("cotiiiiises à jour");
        } else {
            System.out.println("cotiiiiises pas à jour");
        }
    }

}
