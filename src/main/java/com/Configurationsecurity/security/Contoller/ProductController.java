package com.Configurationsecurity.security.Contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/product")
public class ProductController {
    private record  Product(int productId,String name,double value){}

    List<Product> productList=new ArrayList<>(List.of(
            new Product(1,"iphone",999.0)
            ,new Product(2,"Mac Pro",1999.0)
    ));


    @GetMapping
    public ResponseEntity<List<Product>>getProduct(){
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }
    @PostMapping
    public Product savProduct(@RequestBody Product product){
         productList.add(product);
         return product;
    }
}


/* what is record ?
 A record is a special type of class introduced to reduce boilerplate code for data-carrying classes (also called POJOs).

It automatically provides:

Constructor
Getters
equals()
hashCode()
toString()

record are equivalent to :-
public record Person(String name, int age) {}

public final class Person
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() { return name; }
    public int age() { return age; }

    @Override
    public boolean equals(Object o) { ... }

    @Override
    public int hashCode() { ... }

    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
}

*/
