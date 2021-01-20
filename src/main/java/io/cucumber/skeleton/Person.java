package io.cucumber.skeleton;

public class Person {

    String name;
    String surname;
    Float height;
    Float weight;

    public Person () {

    }
    public Person(String name, String surname, Float height, Float weight) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    public void print() {
        String user = "{name: " + this.name + ", surname: " + this.surname + ", height: " + this.height + ", weight: " + this.weight + "}";
        System.out.println("---> New user: " + user);
    }
}
