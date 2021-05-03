package com.ercan;

import java.util.Optional;

public class OptionalOrElse {
    public static void main(String[] args) {

        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("Ercan");
        System.out.println(name);

        Optional<String> optional=Optional.of("hello");
        String message=optional.orElse("world");
        System.out.println("message: "+message);
        System.out.println("message: "+optional.map(String::toUpperCase).orElse("world"));


        /**
         * orElse() ile optional objelere default değer atayabiliriz.
         * Eğer bir optional objesinde değer yoksa/absent, orElse methodunun içindeki değeri alır.
         */

    }
}
