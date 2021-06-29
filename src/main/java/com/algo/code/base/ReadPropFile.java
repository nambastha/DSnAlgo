package com.algo.code.base;

import java.io.*;
import java.util.Properties;

public class ReadPropFile {
    public static void main(String args[]) throws IOException {
        Properties properties = new Properties();
        InputStream is = ReadPropFile.class.getClassLoader().getResourceAsStream("application.properties");
        properties.load(is);

        System.out.println("username ===> "+properties.getProperty("username"));
        System.out.println("password ===> "+properties.getProperty("password"));


        Properties prop = new Properties();
        File path = new File(ReadPropFile.class.getProtectionDomain().getCodeSource().getLocation().getPath());
        String propertiesPath = path.getParentFile().getAbsolutePath();
        System.out.println("propertiesPath ==> "+propertiesPath);
        prop.load(new FileInputStream(propertiesPath+"/application.properties"));

        System.out.println("username ===> "+prop.getProperty("username"));
        System.out.println("password ===> "+prop.getProperty("password"));

    }
}
