package org.example.dao;

import org.example.configuration.ConfigurationDB;
import org.example.DTO.PersonDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
    private final ConfigurationDB configurationDB;

    public PersonDAO(String config_File) {
        if (config_File == null) {
            throw new IllegalArgumentException("Configuration file cannot be null");
        }
        configurationDB = new ConfigurationDB(config_File);
    }

    public List<PersonDTO> getAllPersons() throws SQLException {
        var persons = new ArrayList<PersonDTO>();

        try(Connection connection = DriverManager.getConnection(configurationDB.getUrl(),
                configurationDB.getUsername(),
                configurationDB.getPassword())){
            var query = "SELECT * From person";

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {

                while (resultSet.next()){
                    var id = resultSet.getInt("id");
                    var fullName = resultSet.getString("full_name");
                    var person = new PersonDTO(id, fullName);
                    persons.add(person);
                }
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return persons;
    }

}
