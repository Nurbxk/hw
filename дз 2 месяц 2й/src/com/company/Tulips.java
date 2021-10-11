package com.company;

/**
 * Created by User on 11.10.2021.
 */
public class Tulips extends Flowers{
private String smell;

    protected Tulips(String name, String smell) {
        super(name);
        this.smell = smell;
    }


    public String getSmell() {
        return smell;
    }



    @Override
    public void print() {
        System.out.println("\nName "+ getName() +
        "\n" + smell);

    }
}
