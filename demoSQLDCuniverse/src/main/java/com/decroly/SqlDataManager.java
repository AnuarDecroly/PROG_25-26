package com.decroly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlDataManager {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String SCHEMA = "dcuniverse";
    private static final String USUARIO = "developer";
    private static final String CLAVE = "daw12";

    public static Connection getConnection() {
        Connection connection = null;

        try{
            //Busca la clase por el nombre del driver
            Class.forName(DRIVER);

            //Obtiene la conexion
            connection = DriverManager.getConnection(URL+SCHEMA, USUARIO, CLAVE);

        }catch(ClassNotFoundException e){
            System.err.println("Error de acceso al driver: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error de SQL: " + e.getMessage());
        }

        return connection;
    }

}
