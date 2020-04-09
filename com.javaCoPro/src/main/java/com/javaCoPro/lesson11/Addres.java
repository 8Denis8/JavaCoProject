package com.javaCoPro.lesson11;

public class Addres {
    private String street;
    private String citi;
    private int zipCode;
    private String state;

    public Addres() {
    }

    public Addres(String street, String citi, int zipCode, String state) {
        this.street = street;
        this.citi = citi;
        this.zipCode = zipCode;
        this.state = state;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCiti() {
        return this.citi;
    }

    public void setCiti(String citi) {
        this.citi = citi;
    }

    public int getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Addres street(String street) {
        this.street = street;
        return this;
    }

    public Addres citi(String citi) {
        this.citi = citi;
        return this;
    }

    public Addres zipCode(int zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public Addres state(String state) {
        this.state = state;
        return this;
    }

    // @Override
    // public boolean equals(Object o) {
    // if (o == this)
    // return true;
    // if (!(o instanceof Addres)) {
    // return false;
    // }
    // Addres addres = (Addres) o;
    // return Objects.equals(street, addres.street) && Objects.equals(citi,
    // addres.citi) && zipCode == addres.zipCode && Objects.equals(state,
    // addres.state);
    // }

    // @Override
    // public int hashCode() {
    // return Objects.hash(street, citi, zipCode, state);
    // }

    @Override
    public String toString() {
        return "{" + " street='" + getStreet() + "'" + ", citi='" + getCiti() + "'" + ", zipCode='" + getZipCode() + "'"
                + ", state='" + getState() + "'" + "}";
    }

}