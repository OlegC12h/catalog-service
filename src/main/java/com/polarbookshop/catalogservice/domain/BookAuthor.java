package com.polarbookshop.catalogservice.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookAuthor {
    @Autowired
    public void setName(Writer writer) {
        System.out.println(writer + " of book");
    }
}
