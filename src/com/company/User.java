package com.company;

public class User {
    String name;
    int id;

    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User();
        u1.name = "Alex";
        u1.id = 11;
        u2.name = "Edijs";
        u2.id = 12;

        System.out.println(u1.name + " " + u1.id);
        System.out.println(u2.name + " " + u2.id);


    }

}
