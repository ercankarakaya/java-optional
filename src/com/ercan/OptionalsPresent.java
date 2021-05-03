package com.ercan;

import java.util.Optional;

public class OptionalsPresent {
    public static void main(String[] args) {

        Optional<String> optional=Optional.of("hello");
        System.out.println("isPresent: "+optional.isPresent());
        System.out.println("isEmpty: "+optional.isEmpty());

        String orElse=optional.orElse("world");
        System.out.println(orElse);


        /**
         * isPresent; Optional objesi mevcutsa true döner yoksa false.
         */

    }
}
