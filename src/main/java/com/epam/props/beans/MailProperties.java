package com.epam.props.beans;

import com.epam.props.commons.Constants;
import com.epam.props.enums.MailTypes;
import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource;

/**
 * @author Anton_Savostytskyi on 11/25/2015.
 */

@Resource.Classpath(Constants.PROPERTIES_FILE_NAME)
public class MailProperties {

  private static MailProperties mailProperties;

  private static String MAIL_TYPE = MailTypes.gmail.name();

  @Property("default.login")
  private String mailLogin;

  @Property("default.url")
  private String mailUrl;

  @Property("default.password")
  private String mailPass;

  public static MailProperties getMailProperties() {
    if (mailProperties == null) {
      mailProperties = new MailProperties();
    }
    return mailProperties;
  }

  public MailProperties() {
    PropertyLoader.newInstance().populate(this);
  }


  public String getMailLogin() {
    return mailLogin;
  }

  public String getMailUrl() {
    return mailUrl;
  }

  public String getMailPass() {
    return mailPass;
  }

  public static String getMailType() {
    return MAIL_TYPE;
  }

  public void setMailLogin(String mailLogin) {
    this.mailLogin = mailLogin;
  }

  public void setMailUrl(String mailUrl) {
    this.mailUrl = mailUrl;
  }

  public void setMailPass(String mailPass) {
    this.mailPass = mailPass;
  }

  public static void setMailType(MailTypes mailType) {
    MAIL_TYPE = mailType.name();
  }

  @Override
  public String toString() {
    return "MailProperties ("+getMailType()+"){" +
            "Mail login='" + mailLogin + '\'' +
            ", Mail url='" + mailUrl + '\'' +
            ", Mail password='" + mailPass + '\'' +
            '}';
  }
}
