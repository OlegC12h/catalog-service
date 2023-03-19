package com.polarbookshop.catalogservice.parcers;

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
