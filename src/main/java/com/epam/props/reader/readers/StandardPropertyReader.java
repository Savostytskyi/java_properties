package com.epam.props.reader.readers;

import com.epam.props.commons.Constants;
import com.epam.props.reader.AbstractReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Anton_Savostytskyi on 11/25/2015.
 */

public class StandardPropertyReader extends AbstractReader {

  public Properties getInstance() {
    System.out.println("------------ Read property using standart reader.--------------");
    if (null == properties) {
      properties = new Properties();
      InputStream is;
      try {
        is = new FileInputStream(Constants.PROPERTIES_FILE_PATH);
        properties.load(is);
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    return properties;
  }
}
