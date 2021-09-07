package com.seyo.stepDefs;

import com.seyo.tests.CleanPatchTest;
import com.seyo.tests.NegativeTest;
import com.seyo.tests.PositiveTest;
import com.seyo.tests.WallBoundaryTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitions {

    PositiveTest positiveTest = new PositiveTest();
    WallBoundaryTest wallBoundaryTest = new WallBoundaryTest();
    NegativeTest negativeTest = new NegativeTest();
    CleanPatchTest cleanPatchTest = new CleanPatchTest();

    @Given("That the Robot is initialized and working in a {int}x{int} square room")
    public void that_the_Robot_is_initialized_and_working_in_a_x_square_room(Integer int1, Integer int2) {

    }

    @When("The robot starts at the start coordinate")
    public void the_robot_starts_at_the_start_coordinate() {

    }

    @When("The robot follows the direction instructions")
    public void the_robot_follows_the_direction_instructions() {

    }

    @Then("Robot should end up on the end coordinates specified in payload")
    public void robot_should_end_up_on_the_end_coordinates_specified_in_payload() {

    }

    @Then("Robot should have cleaned amount of patches specified in payload")
    public void robot_should_have_cleaned_amount_of_patches_specified_in_payload() {

    }

}

