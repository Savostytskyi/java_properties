package com.epam.props.configuration;

import com.epam.props.beans.MailProperties;
import com.epam.props.enums.PropertyTypes;
import com.epam.props.reader.ReaderFactory;
import org.apache.commons.configuration.PropertiesConfiguration;
import java.util.Properties;
import static com.epam.props.beans.MailProperties.getMailProperties;

/**
 * @author Anton on 26.11.2015.
 */
public class Configurations {

    public static void setProperties(PropertyTypes propertyTypes) {
        Properties properties = ReaderFactory.getPropertySet(propertyTypes);
        getMailProperties().setMailLogin(properties.getProperty(MailProperties.getMailType() + ".login"));
        getMailProperties().setMailPass(properties.getProperty(MailProperties.getMailType() + ".password"));
        getMailProperties().setMailUrl(properties.getProperty(MailProperties.getMailType() + ".url"));
    }

    public static void setProperties(PropertiesConfiguration configuration) {
        configuration.getProperty("");
        getMailProperties().setMailLogin(configuration.getString(MailProperties.getMailType() + ".login"));
        getMailProperties().setMailPass(configuration.getString(MailProperties.getMailType() + ".password"));
        getMailProperties().setMailUrl(configuration.getString(MailProperties.getMailType() + ".url"));
    }
}


