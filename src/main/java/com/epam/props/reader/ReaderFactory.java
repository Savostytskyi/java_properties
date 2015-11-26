package com.epam.props.reader;

import com.epam.props.enums.PropertyTypes;
import com.epam.props.reader.readers.ApachePropertyReader;
import com.epam.props.reader.readers.GroovyPropertyReader;
import com.epam.props.reader.readers.NPropertyReader;
import com.epam.props.reader.readers.StandardPropertyReader;

import java.util.Properties;

/**
 * @author Anton_Savostytskyi on 11/25/2015.
 */
public class ReaderFactory {

    public static Properties getPropertySet(PropertyTypes type) {
        switch (type) {
            case STANDARD_PROPERTIES:
                return new StandardPropertyReader().getInstance();
            case APACHE_PROPERTIES:
                return new ApachePropertyReader().getInstance();
            case GROOVY_CONFIG:
                return new GroovyPropertyReader().getInstance();
            case N_PROPERTIES:
                return new NPropertyReader().getInstance();
            default:
                return new StandardPropertyReader().getInstance();
        }
    }
}
