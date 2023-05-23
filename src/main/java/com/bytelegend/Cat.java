package com.bytelegend;

public class Cat {
    public String name;

    public static void main(String[] args) {
        Cat tom = createNewCat("Tom");
        tom.sayName();
    }

    public static Cat createNewCat(String name) {
        Cat c = new Cat();
        c.name = name;
        return c;
    }

    // Print my `name` to standard output
    public void sayName() {
        System.out.println("My name is " + this.name + ", my name's length is " + this.name.length());
    }
}
