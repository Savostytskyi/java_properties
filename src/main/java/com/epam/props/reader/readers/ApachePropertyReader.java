package com.epam.props.reader.readers;

import com.epam.props.commons.Constants;
import com.epam.props.reader.AbstractReader;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * @author  Anton on 25.11.2015.
 */
public class ApachePropertyReader extends AbstractReader {

    @Override
    public PropertiesConfiguration getInstance() {
        System.out.println("------------ Read property using 'apache properties' reader.--------------");
        PropertiesConfiguration config = null;
        try {
            config = new PropertiesConfiguration(Constants.PROPERTIES_FILE_PATH);
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
        assert config != null;
        return config;
    }
}
