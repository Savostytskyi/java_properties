package com.epam.props.reader.readers;

import com.epam.props.commons.Constants;
import com.epam.props.reader.AbstractReader;
import jfork.nproperty.Cfg;
import jfork.nproperty.ConfigParser;
import java.util.Properties;

/**
 * @author Anton on 26.11.2015.
 */

@Cfg
public class NPropertyReader extends AbstractReader {

    public Properties getInstance() {
        System.out.println("------------ Read property using 'nProperty' reader.--------------");
        if (null == properties) {
            try {
                properties = ConfigParser.parse(NPropertyReader.class, Constants.PROPERTIES_FILE_PATH);
            } catch (Exception ex) {
                System.err.println("Cann't read properties!");
                ex.printStackTrace();
            }
        }
        return properties;
    }

}
