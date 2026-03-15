package com.minibank;

import com.minibank.model.User;


public class Main {
    public static void main(String[] args) {
        User bob1 = new User("Bob", 500.0);
        User bob2 = new User("Bob", 500.0);
        User bob3 = bob1;

        System.out.println(bob1);

        System.out.println(bob1.equals(bob2));
        System.out.println(bob1 == bob2);
        System.out.println(bob1 == bob3);

        System.out.println(bob1.hashCode());
        System.out.println(bob2.hashCode());

        System.out.println(bob1.getClass().getSimpleName());
    }
}