package model;

public class Gym {

        private String name;
        private double valueMembership; //valor memebresia
        private double valueWorkedWour; //valor por cada hora.
        private int rent;
        private int numberEmployes;
        private int numberMembersPay;
        public static final int MAX_MOUNTHLY_HOURS = 240; //nadie puede trabajar mas de 240 horas


    public Gym(String name, double valueMembership, double valueWorkedWour, int rent) {
        this.name = name;
        this.valueMembership = valueMembership;
        this.valueWorkedWour = valueWorkedWour;
        this.rent = rent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValueMembership() {
        return valueMembership;
    }

    public void setValueMembership(double valueMembership) {
        this.valueMembership = valueMembership;
    }

    public double getValueWorkedWour() {
        return valueWorkedWour;
    }

    public void setValueWorkedWour(double valueWorkedWour) {
        this.valueWorkedWour = valueWorkedWour;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getNumberEmployes() {
        return numberEmployes;
    }

    public void setNumberEmployes(int numberEmployes) {
        this.numberEmployes = numberEmployes;
    }

    public int getNumeberMembersPay() {
        return numberMembersPay;
    }

    public void setNumeberMembersPay(int numeberMembersPay) {
        this.numberMembersPay = numeberMembersPay;
    }
}
