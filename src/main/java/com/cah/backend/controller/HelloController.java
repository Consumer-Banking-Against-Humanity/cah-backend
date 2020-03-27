package com.cah.backend.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

@Controller
public class HelloController {
    @Get("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String index(@QueryValue("name") String name) {
        return "Hello " + name;
    }
}