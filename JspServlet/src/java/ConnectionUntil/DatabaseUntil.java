/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionUntil;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Administrator
 */
public class DatabaseUntil {

    private static final String hostName = "localhost";
    private static final String userCN = "root";
    private static final String password = "hoang123";
    private static final String dbName = "abc";
    private static final String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectionURL, userCN, password);
            System.out.println("oke");
            return conn;
        } catch (Exception e) {
            System.out.println("no");
            e.printStackTrace();;
        }
        return null;
    }

    public static void main(String[] args) {
        DatabaseUntil cu = new DatabaseUntil();
        cu.getConnection();
    }
}
