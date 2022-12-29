package org.example;

import net.bytebuddy.implementation.bind.annotation.Default;
import org.apache.commons.lang3.ArrayUtils;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayUserGenerator {


    private static User generateUser(String[] names, int minAge, int maxAge){
        String id = StringGenerator.generateLatin(11);
        String name = names[Randomizer.randomWithRange(0, names.length - 1)];
        int age = Randomizer.randomWithRange(minAge, maxAge);
        return new User(id, name, age);
    }

    public static ArrayList<User> generateUsers(int amount, String[] nameGender, int minAge, int maxAge){
        ArrayList<User> array = new ArrayList<User>();
        for (int i = 0; i < amount; i++){
            array.add(generateUser(nameGender, minAge, maxAge));
        }
        return array;
    }
//    public static void generateAndPrintUsers(int amount){
//        ArrayList<User> array = new ArrayList<User>();
//        array.addAll(generateUsers(amount, NameArchive.getAny(), 16, 99));
//        for (int i = 0; i < amount; i++){
//            printUserInfo(array, i);
//        }
//    }
//    public static void generateAndPrintUsers(int amount, String[] nameGender){
//        ArrayList<User> array = new ArrayList<User>();
//        array.addAll(generateUsers(amount, nameGender, 16, 99));
//        for (int i = 0; i < amount; i++){
//            printUserInfo(array, i);
//        }
//    }
    public static void generateAndPrintUsers(int amount, String[] nameGender, int minAge, int maxAge){
        ArrayList<User> array = new ArrayList<User>();
        array.addAll(generateUsers(amount, nameGender, minAge, maxAge));
        Stream stream = array.stream();
        stream.forEach(System.out::println);
    }
//    public static void printUserInfo(ArrayList<User> array, int index){
//        System.out.println(array.get(index).toString());
//    }
}
