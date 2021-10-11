package com.company;

public class Main {

    public static void main(String[] args) {
 Flowers [] flowerses = {createObject("Roses"), createObject("Dandelions"),createObject("Tulips")};

for(Flowers flowers : flowerses){
    flowers.print();
}
    }
   public static Flowers createObject(String className){
       if (className.equals("Roses")) {
           Roses rose = new Roses("Rose", 10);
           return rose;
       } else if (className.equals("Dandelions")) {
           Dandelions dandelions = new Dandelions("Dandi", 15);
           return dandelions;
       } else if (className.equals("Tulips")) {
           Tulips tulips = new Tulips("Tulpan", "Like Tulpan");
           return tulips;
       } else {
           return null;
       }
   }
   }

