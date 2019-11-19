package com.example.demodocker.controller;//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class DemoController implements ErrorController{

  @RequestMapping("/demo")
  public String greeting() {
    return "Hi!! ";
  }

  @GetMapping("/hello")
  public Collection<String> sayHello() {
    return IntStream.range(0, 10)
            .mapToObj(i -> "Hello number " + i)
            .collect(Collectors.toList());
  }

  @GetMapping("/greet/{name}")
  public String greeting(@PathVariable String name) {
    return "Hi!! " + name;
  }

  private static final String PATH = "/error";

  @RequestMapping(value = PATH)
  public String error() {
    return "Error handling";
  }

  @Override
  public String getErrorPath() {
    return PATH;
  }

}