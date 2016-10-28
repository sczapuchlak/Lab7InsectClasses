package com.Stephanie;

import java.util.LinkedList;

public class InsectManager {

    public static void main(String[] args) {
        //create butterfly objects
        Butterfly MonarchButterfly = new Butterfly("Monarch Butterfly", 4,6 , "Orange and" +
                "Black", "Milkweed");

        Butterfly CommonYellowSwallowtail = new Butterfly("Common Yellow Swallowtail",
                4, 4, "Yellow and Black", "Milk Parsley");

        //create bee objects
        Bee HoneyBee = new Bee("Honey Bee",4,4,"Yellow and Black", true, "Jasmine" );
        Bee BumbleBee = new Bee("Bumble Bee",4,4,"Black and White", false, "Clover");

        //create a linkedList and add all the insect objects
        LinkedList<Insect> insects = new LinkedList<Insect>();
            insects.add(MonarchButterfly);
            insects.add(CommonYellowSwallowtail);
            insects.add(HoneyBee);
            insects.add(BumbleBee);

        //loop over list and print the species data
            for (Insect i : insects){
                System.out.println(i.printSpeciesData());
        }
    }}
