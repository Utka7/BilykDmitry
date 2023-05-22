package org.example.dao;

import org.example.configuration.ConfigurationDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankDAO {

    private final ConfigurationDB configurationDB;

    public BankDAO(String config_File) {
        if (config_File == null) {
            throw new IllegalArgumentException("Configuration file cannot be null");
        }
        configurationDB = new ConfigurationDB(config_File);
    }

    public void updateBankNames(String newName) throws SQLException {
        try(Connection connection = DriverManager.getConnection(configurationDB.getUrl(),
                configurationDB.getUsername(),
                configurationDB.getPassword())){

            connection.setAutoCommit(false);

            try (Statement statement = connection.createStatement()){
                String query = "UPDATE bank SET name = '" + newName + "'";
                statement.executeUpdate(query);
                connection.commit();
            }
            catch (Exception e) {
                connection.rollback();
            } finally {
                connection.setAutoCommit(true);
            }
        }
    }


}
