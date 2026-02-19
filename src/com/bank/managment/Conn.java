package com.bank.managment;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {

        try {
            // 1. Load Oracle Driver
            Class.forName("oracle.jdbc.OracleDriver");

            // 2. Create Connection
            c = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:orcl",
                "c##riyaoracle",
                "riya18"
            );
            s = c.createStatement();

            System.out.println("Oracle Database Connected Successfully");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
