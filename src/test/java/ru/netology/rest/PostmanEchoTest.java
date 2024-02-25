package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    void shouldResponseEcho() {
        String text = "time";
        given()
                .baseUri("https://postman-echo.com")
                .body("hi")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("time"))
        ;
    }
}