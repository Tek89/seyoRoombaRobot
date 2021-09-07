package com.seyo.stepDefs;

import com.seyo.utilities.ConfigurationReader;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.reset;

public class Hook {

    @Before
    public void setup(){

        baseURI= ConfigurationReader.getProperty("url");
    }



    @After
    public void teardown(){
        reset();
    }

}
