package com.company;

/**
 * Created by User on 11.10.2021.
 */
public class Dandelions extends Flowers {
    private int amount;

    protected Dandelions(String name, int amount) {
        super(name);
        this.amount = amount;
    }

    public int getAmount() {

        return amount;
    }

    @Override
    public void print() {
        System.out.println("Name "  + getName()+
        "\nAmount " + amount);

    }
}
