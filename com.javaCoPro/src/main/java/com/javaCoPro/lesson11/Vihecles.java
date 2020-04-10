package com.javaCoPro.lesson11;

public class Vihecles {
    private Addres addres;
    private Vihecles vihecles;
    private Person owner;

    public Vihecles() {
    }

    public Vihecles(Addres addres, Vihecles vihecles, Person owner) {
        this.addres = addres;
        this.vihecles = vihecles;
        this.owner = owner;
    }

    public Addres getAddres() {
        return this.addres;
    }

    public void setAddres(Addres addres) {
        this.addres = addres;
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

    public Vihecles addres(Addres addres) {
        this.addres = addres;
        return this;
    }

    public Vihecles vihecles(Vihecles vihecles) {
        this.vihecles = vihecles;
        return this;
    }

    public Vihecles owner(Person owner) {
        this.owner = owner;
        return this;
    }

    // @Override
    // public boolean equals(Object o) {
    // if (o == this)
    // return true;
    // if (!(o instanceof Vihecles)) {
    // return false;
    // }
    // Vihecles vihecles = (Vihecles) o;
    // return Objects.equals(addres, vihecles.addres) && Objects.equals(vihecles,
    // vihecles.vihecles) && Objects.equals(owner, vihecles.owner);
    // }

    // @Override
    // public int hashCode() {
    // return Objects.hash(addres, vihecles, owner);
    // }

    @Override
    public String toString() {
        return "{" + " addres='" + getAddres() + "'" + ", vihecles='" + getVihecles() + "'" + ", owner='" + getOwner()
                + "'" + "}";
    }

}