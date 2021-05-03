package com.ercan;

import java.util.Optional;

public class OptionalEmpty {
    public static void main(String[] args) {

        // empty() methodu ile boş bir nesne oluştururuz.

        Optional<String> empty=Optional.empty();
        System.out.println("isPresent: "+empty.isPresent());
        System.out.println("isEmpty: "+empty.isEmpty());


        /**
         *  Optional nesnesi içinde değer olup olmadığına göre iki durumda bulunabilir;
         * present ya da absent. Present durumunda içinde null olmayan bir değer var demektir.
         * Absent durumunda ise boş demektir(null değil). Boş olduğu durumu isPresent() ya da isAbsent() metodları ile
         *kontrol ediyoruz.
         * Boş olan bir optional nesnesinde değere kontrol etmeden erişmeye çalışırsak;
         * NoSuchElementException hatası alırız.
         */

    }
}
