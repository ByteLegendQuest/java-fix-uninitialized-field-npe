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
        int nameLength = (name == null) ? 0 : name.length();
        String nullName = (name == null) ? "" : name;
        System.out.println("My name is " + nullName + ", my name's length is " + nameLength());
    }
}
