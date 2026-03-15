package com.minibank;

import com.minibank.model.User;


public class Main {
    public static void main(String[] args) {
        User bob = new User("Bob", 500, "STANDARD");
        User ali = new User("Ali", 400);
        User alice = new User("Bob", 500, "STANDARD");

        User bobCopy = bob.clone();
        bobCopy.setBalance(999);

        System.out.println(bob);
        System.out.println(bobCopy);

        System.out.println(alice.equals(bob));
    }
}