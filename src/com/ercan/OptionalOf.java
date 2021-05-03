package com.ercan;

import java.util.Optional;

public class OptionalOf {
    public static void main(String[] args) {

        String name = "Ercan";
        Optional<String> opt = Optional.of(name);
        System.out.println(opt.isPresent());

        //Optional Nesnenin Değerlerini Alabilmek için get()
        System.out.println(opt.get());


        /**
         * Null değer almasını kesinlikle istemeyeceğimiz obje oluşturmak için Option.of().
         *Optional.of() metodu ile oluşturduğumuz optional obje için bir değer non-null değer olacağını belirtiriz.
         * Eğer null değer gönderirsek NullPointerException hatası alabiliriz.
         */

        /**
         * NOT:get() özelliği Optional objemizin null olmadığı zamanlarda çalışır. Diğer hallerde hata fırlatır.
         */

    }
}
