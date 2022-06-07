package de.telran;

import java.util.ArrayList;
import java.util.List;

public class B {
    public static void main(String[] args) {


        //Дан list с именами на входе. Необходимо получить на выходе лист
        // с именами в котороом присуствуют только те
        //имена,  которые короче 3-х символов).
        //There is a list with names on the input.
        // We need to get a list with names on the output which contains only those
        //names shorter than 3 characters).


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("USA");
        arrayList.add("Canada");
        arrayList.add("GB");
        arrayList.add("Mongolia");
        arrayList.add("DEU");
        arrayList.add("Spain");
        for (int i = 0; i < arrayList.lastIndexOf(3); i++) {
            System.out.println(arrayList.get(i));
        }
    }

}
