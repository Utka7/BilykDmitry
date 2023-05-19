package org.example.dao;

import lombok.AllArgsConstructor;
import org.example.configuration.ConfigurationDB;
import org.example.models.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
    private static final ConfigurationDB configurationDB;

    static {
        configurationDB = new ConfigurationDB();
    }

    public List<Person> getAllPersons() throws SQLException {
        var persons = new ArrayList<Person>();

        try(Connection connection = DriverManager.getConnection(configurationDB.getURL(),
                configurationDB.getUSERNAME(),
                configurationDB.getPASSWORD())){
            var query = "SELECT * From person";

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {

                while (resultSet.next()){
                    var id = resultSet.getInt("id");
                    var fullName = resultSet.getString("full_name");
                    var person = new Person(id, fullName);
                    persons.add(person);
                }
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return persons;
    }

}
