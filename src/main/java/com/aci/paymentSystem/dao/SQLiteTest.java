package com.aci.paymentSystem.dao;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StateNode;

import java.sql.*;

public class SQLiteTest {

    private static Connection con;
    private static boolean hasData = false;

    public ResultSet displayUsers(){
        if(con == null){
            getConnection();
        }
        try {
            Statement state = con.createStatement();
            ResultSet res = state.executeQuery("select fname, lname from user");
            return res;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public void initialise() throws SQLException{

        if (!hasData){
            hasData = true;
            Statement state =  con.createStatement();
            ResultSet res = state.executeQuery("select name from sqlite_master WHERE type='table' and name='user';");
            if(!res.next()){
                System.out.println("Building the user table with prepopulated values.");
                Statement state2 = con.createStatement();
                state2.execute("CREATE TABLE user(id integer, fname varchar(60),lname varchar(60),primary key(id));");

                PreparedStatement prep = con.prepareStatement("insert  into user  VALUES (?,?,?);");
                prep.setString(2, "Filipp");
                prep.setString(3, "Zaripov");
                prep.execute();

                PreparedStatement prep2 = con.prepareStatement("insert  into user  VALUES (?,?,?);");
                prep.setString(2, "Paul");
                prep.setString(3, "Smith");
                prep.execute();
            }
        }
    }

    private Connection getConnection(){

        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:SQLiteTest1.db");
            initialise();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        }


        return con;
    }

    public void addUser(String firstName, String lastName) throws SQLException{
        if (con == null){
            getConnection();
        }
        PreparedStatement prep = con.prepareStatement("insert  into user  VALUES (?,?,?)");
        prep.setString(2, firstName);
        prep.setString(3, lastName);
        prep.execute();
    }
}
