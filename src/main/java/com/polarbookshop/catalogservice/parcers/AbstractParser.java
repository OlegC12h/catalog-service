package com.polarbookshop.catalogservice.parcers;

import com.polarbookshop.catalogservice.domain.Parser;
import com.polarbookshop.catalogservice.domain.ParserRegistrator;

public abstract class AbstractParser implements Parser {
    public AbstractParser(ParserRegistrator registrator) {
        registrator.register(getName(), this);
    }
}
