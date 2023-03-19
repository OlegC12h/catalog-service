package com.polarbookshop.catalogservice.parcers;

public abstract class AbstractParser implements Parser {
    public AbstractParser(ParserRegistrator registrator) {
        registrator.register(getName(), this);
    }
}
