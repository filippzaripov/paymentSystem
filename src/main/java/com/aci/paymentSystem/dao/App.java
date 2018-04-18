package com.aci.paymentSystem.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) throws SQLException {

        ResultSet rs;
        SQLiteTest test = new SQLiteTest();
        rs = test.displayUsers();
        while (rs.next()) {
            System.out.println(rs.getString("fname") + " " + rs.getString("lname"));
        }
    }
}
