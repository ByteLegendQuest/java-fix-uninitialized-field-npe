package com.bytelegend;

public class Cat {
    public String name;

    Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cat tom = createNewCat("Tom");
        tom.sayName();

        Cat.createNewCat("ABCDEF").sayName();
    }

    public static Cat createNewCat(String name) {
        return new Cat(name);
    }

    // Print my `name` to standard output
    public void sayName() {
        if (name != null) {
            System.out.println("My name is " + name + ", my name's length is " + name.length());
        }
    }
}
