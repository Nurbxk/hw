package com.company;

/**
 * Created by User on 11.10.2021.
 */
public class Roses extends Flowers {
    private int Beauty;
    protected Roses(String name, int Beauty) {
        super(name);
        this.Beauty = Beauty;
    }

    public int getBeauty() {
        return Beauty;
    }

    @Override
    public void print() {
        System.out.println("Name " + getName() +
        "\nBeauty " + Beauty);
    }
}
