package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
    }
    @GetMapping("/get")//Ler entrada no banco de dados
    public String get(@RequestParam(value = "name", defaultValue = "get") String name) {
      return String.format("Request %s!", name);
    }
    @PostMapping("/post")//Criar entrada no banco de dados
    public String post(@RequestParam(value = "name", defaultValue = "post") String name) {
        return String.format("Request %s!", name);
      }
    @PutMapping("/patch")//Criar entrada no banco de dados
    public String patch(@RequestParam(value = "name", defaultValue = "patch") String name) {
        return String.format("Request %s!", name);
      }
    @DeleteMapping("/delete")//Criar entrada no banco de dados
    public String delete(@RequestParam(value = "name", defaultValue = "delete") String name) {
        return String.format("Hello %s!", name);
      }
    }

