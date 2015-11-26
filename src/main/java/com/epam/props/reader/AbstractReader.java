package com.epam.props.reader;

import java.util.Properties;

/**
 * @author by Anton on 26.11.2015.
 */
public abstract class AbstractReader<T> {

    public Properties properties;

    public abstract T getInstance();
}


