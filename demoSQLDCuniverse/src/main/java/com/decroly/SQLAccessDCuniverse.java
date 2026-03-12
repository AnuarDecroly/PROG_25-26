package com.decroly;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SQLAccessDCuniverse {

    public static List<String> getCharactersName(){
        List<String> heroNames = new LinkedList<>();

        //Sentencia SQL
        String sqlHeroNames = "SELECT heroName FROM characters";

        try(Connection connection = SqlDataManager.getConnection();
            Statement stament = connection.createStatement();
            ResultSet resultSets = stament.executeQuery(sqlHeroNames)) {

            while (resultSets.next()) {
                heroNames.add(resultSets.getNString(1));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return heroNames;
    }

    public static List<Character> getCharacters(){
        List<Character> heros = new LinkedList<>();

        //Consulta SQL
        String sqlHeros = "SELECT * FROM characters";

        try(Connection connection = SqlDataManager.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSets = statement.executeQuery(sqlHeros)) {
            while (resultSets.next()) {
                int id = resultSets.getInt(1);
                String name = resultSets.getNString(2);
                String fullname = resultSets.getNString(3);
                String gender = resultSets.getNString(7);
                String race = resultSets.getNString(8);
                String aligment = resultSets.getNString(9);

                heros.add(new Character(id, name, fullname, gender, race, aligment));

            }

        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
        }
        return  heros;
    }

    public static Character getCharacter(int id){
        Character hero = null;

        //Consulta SQL
        String sqlHeros = "SELECT * FROM characters WHERE id = ?";

        try(Connection connection = SqlDataManager.getConnection();
        PreparedStatement statement = connection.prepareStatement(sqlHeros)) {

            statement.setInt(1, id);
            ResultSet resultSets = statement.executeQuery();

            while (resultSets.next()) {
                int heroId = resultSets.getInt(1);
                String heroName = resultSets.getNString(2);
                String fullname = resultSets.getNString(3);
                String gender = resultSets.getNString(7);
                String race = resultSets.getNString(8);
                String aligment = resultSets.getNString(9);

                hero = new Character(id, heroName, fullname, gender, race, aligment);
            }

        }catch (SQLException e){
            System.err.println("Error getting character: "+e.getMessage());
        }
        return hero;
    }

    public static List<Character> getCharacterByName(String name){
        List<Character> heros = new LinkedList<>();
        String sqlHeros = "SELECT * FROM characters WHERE heroName = ?";

        try(Connection connection = SqlDataManager.getConnection();
        PreparedStatement statement = connection.prepareStatement(sqlHeros)) {
            statement.setString(1, name);
            ResultSet resultSets = statement.executeQuery();
            while (resultSets.next()) {
                int id = resultSets.getInt(1);
                String heroName = resultSets.getNString(2);
                String fullname = resultSets.getNString(3);
                String gender = resultSets.getNString(7);
                String race = resultSets.getNString(8);
                String aligment = resultSets.getNString(9);

                heros.add(new Character(id, heroName, fullname, gender, race, aligment));
            }

        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
        }


        return  heros;
    }

    public static List<Character> getCharacterByNameAndAlterEgo(String heroName, String alterEgo){
        List<Character> heros = new LinkedList<>();

        //Consulta SQL
        String sqlStatement =  "SELECT * FROM characters WHERE heroName = ? and fullName = ?";

        try(Connection connection = SqlDataManager.getConnection();
        PreparedStatement statement = connection.prepareStatement(sqlStatement)) {
            statement.setString(1, heroName);
            statement.setString(2, alterEgo);

            ResultSet resultSets = statement.executeQuery();

            while (resultSets.next()) {
                int id = resultSets.getInt(1);
                String name = resultSets.getNString(2);
                String fullname = resultSets.getNString(3);
                String gender = resultSets.getNString(7);
                String race = resultSets.getNString(8);
                String aligment = resultSets.getNString(9);

                heros.add(new Character(id, name, fullname, gender, race, aligment));
            }

        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
        }

        return heros;
    }
}
