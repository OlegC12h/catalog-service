package com.polarbookshop.catalogservice.parcers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FirstParser extends AbstractParser implements Parser {

    @Autowired
    public FirstParser(ParserRegistrator registrator) {
        super(registrator);
    }

    @Override
    public String getName() {
        return "FirstParser";
    }
}
