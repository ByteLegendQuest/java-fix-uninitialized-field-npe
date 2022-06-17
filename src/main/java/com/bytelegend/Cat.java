package com.bytelegend;

public class Cat {
    public String name;

    public static void main(String[] args) {
        Cat tom = createNewCat("Tom");
        tom.sayName();
    }

    public static Cat createNewCat(String name) {
        return new Cat();
    }

    // Print my `name` to standard output
    public void sayName() {
        if (!name.isNull()) {
            System.out.println("My name is " + name + ", my name's length is " + name.length());
        } else {
            System.out.println("My name is , my name's length is 0");
        }
        
    }
}
