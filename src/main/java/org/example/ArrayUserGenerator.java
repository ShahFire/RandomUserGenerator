package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayUserGenerator {
    @FunctionalInterface
    public interface Supplier<T> extends java.util.function.Supplier<T> {
        T get();
    }
    private static Supplier<User> generateUser = () -> {
        String id = StringGenerator.generateLatin(11);
        String[] names =  NameArchive.getAny();
        String name = names[Randomizer.randomWithRange(0, names.length - 1)];
        int age = Randomizer.randomWithRange(16, 99);
        return new User(id, name, age);
    };
    public static List<User> generateUsers(int sizeStream){
        Stream stream = Stream.generate(generateUser).limit(sizeStream);
        return stream.toList();
    }
    public static List<User> ageFilter(List<User> list, int minAge, int maxAge){
        List<User> filtered = list.stream().filter(p -> p.getAge() < maxAge).filter(p -> p.getAge() > minAge).collect(Collectors.toList());
        Stream filterStream = filtered.stream();
        return filterStream.toList();
    }
    public static List<User> maleFilter(List<User> list){
        List<String> maleList = Arrays.asList(NameArchive.getMale());
        List<User> filtered = list.stream().filter(p -> maleList.contains(p.getName())).collect(Collectors.toList());
        Stream filterStream = filtered.stream();
        return filterStream.toList();
    }
    public static List<User> femaleFilter(List<User> list){
        List<String> femaleList = Arrays.asList(NameArchive.getFemale());
        List<User> filtered = list.stream().filter(p -> femaleList.contains(p.getName())).collect(Collectors.toList());
        Stream filterStream = filtered.stream();
        return filterStream.toList();
    }
    public static void printlnUsers(List<User> list){
        list.stream().toList().forEach(System.out::println);
    }
}
