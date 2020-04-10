package com.javaCoPro.lesson11;

public class Farm {
    private Addres address;
    private Vihecles vihecles;
    private Person owner;

    public Farm() {
    }

    public Farm(Addres address, Vihecles vihecles, Person owner) {
        this.address = address;
        this.vihecles = vihecles;
        this.owner = owner;
    }

    public Addres getAddress() {
        return this.address;
    }

    public void setAddress(Addres address) {
        this.address = address;
    }

    public Vihecles getVihecles() {
        return this.vihecles;
    }

    public void setVihecles(Vihecles vihecles) {
        this.vihecles = vihecles;
    }

    public Person getOwner() {
        return this.owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Farm address(Addres address) {
        this.address = address;
        return this;
    }

    public Farm vihecles(Vihecles vihecles) {
        this.vihecles = vihecles;
        return this;
    }

    public Farm owner(Person owner) {
        this.owner = owner;
        return this;
    }

    // @Override
    // public boolean equals(Object o) {
    // if (o == this)
    // return true;
    // if (!(o instanceof Farm)) {
    // return false;
    // }
    // Farm farm = (Farm) o;
    // return Objects.equals(address, farm.address) && Objects.equals(vihecles,
    // farm.vihecles) && Objects.equals(owner, farm.owner);
    // }

    // @Override
    // public int hashCode() {
    // return Objects.hash(address, vihecles, owner);
    // }

    @Override
    public String toString() {
        return "{" + " address='" + getAddress() + "'" + ", vihecles='" + getVihecles() + "'" + ", owner='" + getOwner()
                + "'" + "}";
    }

}