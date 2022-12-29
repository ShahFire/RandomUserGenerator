package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
          List<User> users = ArrayUserGenerator.generateUsers(3);
          ArrayUserGenerator.printlnUsers(users);
          List<User> filterUsers = ArrayUserGenerator.ageFilter(users, 50, 100);
          ArrayUserGenerator.printlnUsers(filterUsers);
          List<User> arrayList = ArrayUserGenerator.maleFilter(users);
        ArrayUserGenerator.printlnUsers(arrayList);

    }
}