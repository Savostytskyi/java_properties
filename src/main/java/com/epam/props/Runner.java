package com.epam.props;

import com.epam.props.beans.MailProperties;
import com.epam.props.configuration.Configurations;
import com.epam.props.enums.PropertyTypes;
import com.epam.props.reader.readers.ApachePropertyReader;

import static com.epam.props.configuration.Configurations.*;

/**
 * @author Anton_Savostytskyi on 11/25/2015.
 *
 */

public class Runner {

  public static void main(String[] args) {

    System.out.println("------------ Set default properties using 'yandex properties' reader.--------------");
    MailProperties mailProperties = new MailProperties();
    System.out.println(mailProperties);

    ApachePropertyReader reader = new ApachePropertyReader();
    Configurations.setProperties(reader.getInstance());
    System.out.println(MailProperties.getMailProperties());

    setProperties(PropertyTypes.N_PROPERTIES);
    System.out.println(MailProperties.getMailProperties());

    setProperties(PropertyTypes.GROOVY_CONFIG);
    System.out.println(MailProperties.getMailProperties());

    setProperties(PropertyTypes.STANDARD_PROPERTIES);
    System.out.println(MailProperties.getMailProperties());


  }

}
