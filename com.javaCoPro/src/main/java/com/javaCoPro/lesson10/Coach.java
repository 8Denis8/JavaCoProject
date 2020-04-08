package com.javaCoPro.lesson10;

public class Coach {
    private String name;
    private String lastName;
    private String sport;

    public Coach() {
    }

    public Coach(String name, String lastName, String sport) {
        this.name = name;
        this.lastName = lastName;
        this.sport = sport;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // public void setLastName(String lastName) {
    // if(lastName.length()<2){
    // System.out.println("wrong lastname");
    // this.lastName="00";
    // return;
    // }
    // this.lastName = lastName;
    // }

    public String getSport() {
        return this.sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public Coach name(String name) {
        this.name = name;
        return this;
    }

    public Coach lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Coach sport(String sport) {
        this.sport = sport;
        return this;
    }

    // @Override
    // public boolean equals(Object o) {
    // if (o == this)
    // return true;
    // if (!(o instanceof Coach)) {
    // return false;
    // }
    // Coach coach = (Coach) o;
    // return Objects.equals(name, coach.name) && Objects.equals(lastName,
    // coach.lastName) && Objects.equals(sport, coach.sport);
    // }

    // @Override
    // public int hashCode() {
    // return Objects.hash(name, lastName, sport);
    // }

    // @Override
    // public String toString() {
    // return "{" +
    // " name='" + getName() + "'" +
    // ", lastName='" + getLastName() + "'" +
    // ", sport='" + getSport() + "'" +
    // "}";
    // }

}