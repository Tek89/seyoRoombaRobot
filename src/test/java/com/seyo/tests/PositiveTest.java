package com.seyo.tests;

import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class PositiveTest {

    @Test
        public void PsoitiveTestwithPojo(){

            Gson gson = new Gson();

            //JSON to Java collections or Pojo --> De-serialization

            String myJsonData = "{\n" +
                    "    \"roomSize\": [5,5],\n" +
                    "    \"coordinates\": \"[1,3]\",\n" +
                    "    \"instructions\": \"NNESEESWNWW\",\n" +
                    "    \"patches\": [\n" +
                    "    [1, 0],\n" +
                    "    [2, 2],\n" +
                    "    [2, 3]\n" +
                    "  ]\n" +
                    "}";

            Map<String,Object> map = gson.fromJson(myJsonData, Map.class);
            System.out.println(map);

            Roomba result = gson.fromJson(myJsonData,Roomba.class);
            System.out.println(result);



        }
}
