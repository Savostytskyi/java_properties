package com.epam.props;

import com.epam.props.beans.MailProperties;
import com.epam.props.enums.PropertyTypes;
import static com.epam.props.configuration.Configurations.*;

/**
 * @author Anton_Savostytskyi on 11/25/2015.
 *
 */

public class Runner {

  public static void main(String[] args) {

    MailProperties mailProperties = new MailProperties();
    System.out.println(mailProperties);
    setProperties(PropertyTypes.N_PROPERTIES);
    System.out.println(MailProperties.getMailProperties());

    setProperties(PropertyTypes.GROOVY_CONFIG);
    System.out.println(MailProperties.getMailProperties());

    setProperties(PropertyTypes.STANDARD_PROPERTIES);
    System.out.println(MailProperties.getMailProperties());

    setProperties(PropertyTypes.APACHE_PROPERTIES);
    System.out.println(MailProperties.getMailProperties());

  }

}
