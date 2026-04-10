package com.decroly;

public class SingletonSQLDataManager {

    private static SingletonSQLDataManager instance;

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String SCHEMA = "dcuniverse";
    private static final String USUARIO = "developer";
    private static final String CLAVE = "daw12";

    private SingletonSQLDataManager(){}

    public static SingletonSQLDataManager getInstance(){
        if(instance == null){
            instance = new SingletonSQLDataManager();
        }
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SingletonSQLDataManager{");
        sb.append('}');
        return sb.toString();
    }
}
