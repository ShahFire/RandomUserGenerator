package org.example;

public class User {
    private static String id;
    private static String name;
    private static int age;

    public User(String id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public static String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public static int getAge(){
        return age;
    }
    public void setName(int age){
        this.age = age;
    }

    public String toString(){
        return id + " " + name + " " + age;
    }
}
