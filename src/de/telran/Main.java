package de.telran;

public class Main {

    public static void main(String[] args) {

        //A list is given. Expand it from the end to the beginning
        // (vice versa). For example: <1,2,3,4,5> -> <5,4,3,2,1>

        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println("array is : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("reverse is : ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
