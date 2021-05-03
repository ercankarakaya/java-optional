package com.ercan;

import java.util.Optional;

public class OptionalOfNullable {
    public static void main(String[] args) {

        System.out.println("--- EXAMPLE 1 ----");
        String name = "Ercan";
        Optional<String> opt = Optional.ofNullable(name);
        System.out.println(opt.isPresent());
        opt.ifPresent(i-> System.out.println("opt objesi bulunmakta..."));
        //Optional Nesnenin Değerlerini Alabilmek için get()
        System.out.println(opt.get());

        System.out.println("--- EXAMPLE 2 ----");
        Optional<Person> person=Optional.ofNullable(new Person(1L,"ALi",26));
        person.filter(p -> p.getAge() >25).ifPresent(System.out::println);


        /**
         * ofNullable(); Null değer alabilecek olan Optional objesi.
         * of methodundan farklı olarak bu metodda değerin null olabileceğini belirtiriz.
         * Null değer gönderirsek bu sefer farklı olarak NoSuchElementException hatası alırız.
         * Null değer gönderdiğimizde isPresent bize false değeri döndürecektir.
         */

        /**
         * NOT:get() özelliği Optional objemizin null olmadığı zamanlarda çalışır. Diğer hallerde hata fırlatır.
         */

    }

 public static class Person{

        private Long id;
        private String name;
        private int age;

     public Person(Long id, String name, int age) {
         this.id = id;
         this.name = name;
         this.age = age;
     }

     public Person() {
     }

     public Long getId() {
         return id;
     }

     public void setId(Long id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     @Override
     public String toString() {
         return "Person{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 ", age=" + age +
                 '}';
     }
 }

}
