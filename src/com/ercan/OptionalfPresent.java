package com.ercan;

import java.util.Optional;

public class OptionalfPresent {
    public static void main(String[] args) {

        // BEFORE Java 8
        String name = "Ercan";
        if(name != null) {
            System.out.println(name);
        }

        // AFTER Java 8
        Optional<String> optional=Optional.of(name);
        optional.ifPresent(n -> System.out.println(n));
        // or
        optional.ifPresent(System.out::println);


        /**
         * If ile optional içinde bir değerin olup olmadığını kontrol ederek işlemler yapabiliriz.
         * ifPresent metodu ise bunu daha kısa yoldan yapmamızı sağlıyor
         */

    }
}
