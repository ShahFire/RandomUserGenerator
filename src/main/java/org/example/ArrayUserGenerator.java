package org.example;

import java.util.ArrayList;

public class ArrayUserGenerator {
    private static String[] names = {"Jacob", "Oliver", "Riley", "Jack", "Alfie", "Harry", "Charlie", "Dylan", "William", "Mason", "Amelia", "Ava", "Mia", "Lily", "Olivia"};

    private static User generateUser(){
        String id = StringGenerator.generateLatin(11);
        String name = names[Randomizer.randomWithRange(0, names.length - 1)];
        int age = Randomizer.randomWithRange(16, 99);
        return new User(id, name, age);
    }

    public static ArrayList<User> generateUsers(int amount){
        ArrayList<User> array = new ArrayList<User>();
        for (int i = 0; i < amount; i++){
            array.add(generateUser());
        }
        return array;
    }
    public static void generateAndPrintUsers(int amount){
        ArrayList<User> array = new ArrayList<User>();
        array.addAll(generateUsers(amount));
        for (int i = 0; i < amount; i++){
            printUserInfo(array, i);
        }
    }
    public static void printUserInfo(ArrayList<User> array, int index){
        System.out.println(array.get(index).toString());
    }
}
