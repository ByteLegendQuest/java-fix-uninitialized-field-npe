package com.bytelegend;

public class Cat {
    public String name;

    public static void main(String[] args) {
        Cat tom = createNewCat("Tom");
        tom.sayName();
    }

    public static Cat createNewCat(String name) {
        cat = new Cat();
        cat.name = name;
        return cat;
    }

    // Print my `name` to standard output
    public void sayName() {
        cat = new Cat();
        name = cat.name;
        System.out.println("My name is " + name + ", my name's length is " + name.length());
    }
}
