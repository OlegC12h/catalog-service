package com.polarbookshop.catalogservice.parcers;

import com.polarbookshop.catalogservice.domain.Parser;
import com.polarbookshop.catalogservice.domain.ParserRegistrator;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ParserBuilder implements ParserRegistrator {
    Map<String, Parser> parsers = new HashMap<>();

    public void parse() {
        parsers.forEach((k, v) -> v.parse());
    }

    @Override
    public void register(String name, Parser parser) {
        parsers.put(name, parser);
    }
}
