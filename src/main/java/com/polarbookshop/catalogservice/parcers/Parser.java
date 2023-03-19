package com.polarbookshop.catalogservice.parcers;

public interface Parser {
    String getName();
    default void parse() {
        System.out.println(getName());
    };
}
