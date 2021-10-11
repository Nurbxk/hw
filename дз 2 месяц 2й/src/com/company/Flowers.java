package com.company;

/**
 * Created by User on 11.10.2021.
 */
public abstract class Flowers  implements Printable{
    private String name;

    protected Flowers(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
