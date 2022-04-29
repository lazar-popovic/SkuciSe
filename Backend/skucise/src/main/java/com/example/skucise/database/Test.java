package com.example.skucise.database;
import java.sql.*;
import java.sql.DriverManager;

public class Test
{
    private Connection conn = null;
    private Statement stmt = null;

    public Test()
    {
        try
        {
            System.out.println("Connecting...");
            conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/skucise","root","");
            stmt = conn.createStatement();
            System.out.println("Connected");
        }
        catch (Exception e)
        {
            System.out.println(e.getStackTrace());
        }
    }

    public ResultSet getAllAdvertisment()
    {
        ResultSet rs =null;
        try
        {
            String sql ="SELECT * FROM `oglasi`";
            rs = stmt.executeQuery(sql);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return rs;
    }

}
