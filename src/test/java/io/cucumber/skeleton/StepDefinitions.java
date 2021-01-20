package io.cucumber.skeleton;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

//    @When("I wait {int} hour")
//    public void I_wait(int time) throws InterruptedException {
//        Thread.sleep((long)(time * 1000));
//    }
//
//    @Then("my belly should growl")
//    public void Belly_should_growl() {
//        Belly belly = new Belly();
//        belly.growl();
//    }
//
//    @Given("I drink some water")
//    public void I_drink_some_water() {
//        System.out.println("---> Glu, glu, glu!");
//    }
//
//    @Then("my belly should burp")
//    public void Belly_should_burp() {
//        Belly belly = new Belly();
//        belly.burp();
//    }
//
//    @Given("I want to eat {word}")
//    public void I_want_to_eat(String food) {
//        System.out.println("Enjoy your " + food);
//    }
//
//    @Given("I want to eat cukes")
//    public void I_want_to_eat_cukes() {
//       System.out.println("Enjoy your cukes");
//    }
//
//    @Given("I enter new user")
//    public void I_enter_new_user(DataTable data) {
//        Person user = new Person();
//
//        for (int i = 0; i < data.cells().size(); i++) {
//            String key = data.cells().get(i).get(0);
//            String value = data.cells().get(i).get(1);
//
//            switch(key) {
//                case "name":
//                    user.name = value;
//                    break;
//                case "surname":
//                    user.surname = value;
//                    break;
//                case "height":
//                    user.height = Float.parseFloat(value);
//                    break;
//                case "weight":
//                    user.weight = Float.parseFloat(value);
//            }
//        }
//
//        user.print();
//    }
}
