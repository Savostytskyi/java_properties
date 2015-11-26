package com.epam.props.configuration;

import com.epam.props.beans.MailProperties;
import com.epam.props.enums.MailTypes;
import com.epam.props.enums.PropertyTypes;
import com.epam.props.reader.ReaderFactory;

import java.util.Properties;

import static com.epam.props.beans.MailProperties.getMailProperties;

/**
 * @author Anton on 26.11.2015.
 */
public class Configurations {

    public static final String MAIL_TYPE = MailTypes.deffault.name();

    public static void setProperties(PropertyTypes propertyTypes) {
        Properties properties = ReaderFactory.getPropertySet(propertyTypes);
        getMailProperties().setMailLogin(properties.getProperty(MailProperties.getMailType() + ".login"));
        getMailProperties().setMailPass(properties.getProperty(MailProperties.getMailType() + ".password"));
        getMailProperties().setMailUrl(properties.getProperty(MailProperties.getMailType() + ".url"));
    }
}


