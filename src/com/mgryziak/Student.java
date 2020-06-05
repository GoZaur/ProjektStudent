package com.mgryziak;

public class Student<arraylist> {
    private String name, lastName;
    public String sport, scholarship, dyscypline;
    public String nr_albumu;
    private double amount;

    public Student() {
        this.dyscypline = "Nie trenuje";
        this.amount = 00.00;
    }


    public String getName() {
        return name;
    }


    public void setName(String newName) {
        this.name = newName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String newlastName) {
        this.lastName = newlastName;
    }


    public String getSport() {
        return sport;
    }


    public void setSport(String newSport) {
        this.sport = newSport;
    }


    public String getNr_albumu() {
        return nr_albumu;
    }


    public void setNr_albumu(String new_nr) {
        this.nr_albumu = new_nr;
    }


    public double getAmount() {
        return amount;
    }


    public void setAmount(double new_amount) {
        this.amount = new_amount;
    }


    public String getScholarship() {
        return scholarship;
    }


    public void setScholarship(String new_scholarship) {
        this.scholarship = new_scholarship;
    }


    public String getDyscypline() {
        return dyscypline;
    }


    public void setDyscypline(String new_dyscypline) {
        this.dyscypline = new_dyscypline;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sport='" + sport + '\'' +
                ", scholarship='" + scholarship + '\'' +
                ", dyscypline='" + dyscypline + '\'' +
                ", nr_albumu='" + nr_albumu + '\'' +
                ", amount=" + amount +
                '}';
    }




}


