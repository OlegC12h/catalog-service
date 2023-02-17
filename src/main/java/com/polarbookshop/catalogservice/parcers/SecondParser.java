package com.polarbookshop.catalogservice.parcers;

import com.polarbookshop.catalogservice.domain.Parser;
import com.polarbookshop.catalogservice.domain.ParserRegistrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecondParser extends AbstractParser implements Parser {

    @Autowired
    public SecondParser(ParserRegistrator registrator) {
        super(registrator);
    }

    @Override
    public String getName() {
        return "Second Parser";
    }
}
