package de.telran;

import java.util.ArrayList;
import java.util.List;

public class Country {
    public static void main(String[] args) {

        ArrayList<String> anyname = new ArrayList<>();
        anyname.add("USA");
        anyname.add("Canada");
        anyname.add("GB");
        anyname.add("Mongolia");
        anyname.add("DEU");
        anyname.add("Spain");
        System.out.println(strings(anyname));

    }
    //There is a list with names on the input.
    // We need to get a list with names on the output which contains only those
    //names shorter than 3 characters).

    public static ArrayList<String> strings(ArrayList<String> anyname) {

        ArrayList<String> shortname = new ArrayList<>();
        for (int i = 0; i < anyname.size(); i++) {
            if (anyname.get(i).length() <= 3) {
                shortname.add(anyname.get(i));
            }
        }
        return shortname;
    }
}
