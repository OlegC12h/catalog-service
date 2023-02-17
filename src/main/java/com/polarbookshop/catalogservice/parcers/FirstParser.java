package com.polarbookshop.catalogservice.parcers;

import com.polarbookshop.catalogservice.domain.Parser;
import com.polarbookshop.catalogservice.domain.ParserRegistrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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
