package com.epam.props.reader.readers;

import com.epam.props.reader.AbstractReader;
import groovy.util.ConfigSlurper;
import java.io.*;
import java.net.MalformedURLException;
import java.util.Properties;
import static com.epam.props.beans.MailProperties.getMailType;
import static com.epam.props.commons.Constants.GROOVY_COFIG_FILE_PATH;

/**
 * @author Anton on 25.11.2015.
 */
public class GroovyPropertyReader extends AbstractReader {

    public Properties getInstance() {
        System.out.println("------------ Read property using 'groovy configuration' reader.--------------");
        if (null == properties) {
            try {
                File file = new File(GROOVY_COFIG_FILE_PATH);
                properties = new ConfigSlurper(getMailType()).parse(file.toURI().toURL()).toProperties();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return properties;
    }
}
