package io.cucumber.skeleton;

import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hook {

    @Before(order = 10, value = "@hook")
    public void setup(){
        System.out.println("---> I have an Almax!");
    }

    @After(order = 10, value = "@hook")
    public void cleanup() {
        System.out.println("---> I go to the bathroom!");
    }
}
