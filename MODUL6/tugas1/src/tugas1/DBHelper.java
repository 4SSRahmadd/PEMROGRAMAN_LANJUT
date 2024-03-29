/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.sql.*;

/**
 *
 * @author rayno
 */
public class DBHelper {

    private static Connection connection;

    public static void bukaKoneksi() {
        if (connection == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/data";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException t) {
                System.out.println("Error connection!");
            }
        }
    }

    public static int insertQueryGetId(String query) {
        bukaKoneksi();
        int num = 0;
        int result = -1;
        try {
            Statement stmt = connection.createStatement();
            num = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                result = rs.getInt(1);
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            result = -1;
        }
        return result;
    }

    public static boolean executeQuery(String query) {
        bukaKoneksi();
        boolean result = false;
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);
            result = true;
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static ResultSet selectQuery(String query) {
        bukaKoneksi();
        ResultSet rs = null;
        try {
            Statement stmt = connection.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}
