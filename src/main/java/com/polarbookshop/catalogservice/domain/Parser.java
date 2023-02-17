package com.polarbookshop.catalogservice.domain;

public interface Parser {
    String getName();
    default void parse() {
        System.out.println(getName());
    };
}
