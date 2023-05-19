package org.example.configuration;

import lombok.Getter;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Getter
public class ConfigurationDB {
    private final String URL;
    private final String USERNAME;
    private final String PASSWORD;
    private final String CONFIG_FILE = "application.properties";

    public ConfigurationDB() {
        Properties properties = loadProperties();
        this.URL = properties.getProperty("db.url");
        this.USERNAME = properties.getProperty("db.username");
        this.PASSWORD = properties.getProperty("db.password");
    }

    private Properties loadProperties() {
        Properties properties = new Properties();
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(CONFIG_FILE)) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

}
