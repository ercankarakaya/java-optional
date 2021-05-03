package com.ercan;

import java.util.Optional;

public class OptionalOrElseGet {
    public static void main(String[] args) {


        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseGet(() -> "Ercan");
        System.out.println("name: "+name);

        Optional<String> optional=Optional.ofNullable(null);
        String message=optional.orElseGet(() -> "world");
        System.out.println("message: "+message);
        String orElseGet= optional
                .map(String::toUpperCase)
                .orElseGet(() ->{
                   //...extra code
                    int number=123;
                    System.out.println("number: "+number);
                   return "hello world";
                });
        System.out.println(orElseGet);


        /**
         * Bu method orElse() den farklı olarak parametre olarak Supplier fonksiyonel interfaceni
         * implement eden bir lambda expression içerir.
         */
    }
}
